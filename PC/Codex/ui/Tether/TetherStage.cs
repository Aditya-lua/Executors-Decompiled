namespace Tether;

public enum TetherStage
{
	Accept,
	Upgrade,
	ChallengeSent,
	ChallengeReceived,
	HelloSent,
	HelloReceived,
	HelloDecrypt,
	HelloMac,
	HelloParse,
	WelcomeSent,
	WelcomeReceived,
	FrameReceive,
	FrameDecrypt,
	FrameSend,
	Close
}
