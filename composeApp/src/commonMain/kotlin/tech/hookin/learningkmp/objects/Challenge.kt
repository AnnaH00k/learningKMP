package tech.hookin.learningkmp.objects

data class Challenge(
    val id: Int,
    val name: String,
    var description: String,
    var ChallengeType: List<ChallengeType> = emptyList(),
    var Task: List<Task> = emptyList(),

    )
