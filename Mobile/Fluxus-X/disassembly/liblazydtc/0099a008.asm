; ix::WebSocketTransport::getRandomUnsigned @ 0099a008
0099a008	stp x29,x30,[sp, #-0x10]!
0099a00c	mov x29,sp
0099a010	bl 0x00c31910
0099a014	mov x8,#0x34db
0099a018	movk x8,#0xd7b6, LSL #16
0099a01c	movk x8,#0xde82, LSL #32
0099a020	movk x8,#0x431b, LSL #48
0099a024	smulh x8,x0,x8
0099a028	lsr x9,x8,#0x3f
0099a02c	lsr x8,x8,#0x12
0099a030	add w0,w8,w9
0099a034	ldp x29,x30,[sp], #0x10
0099a038	ret
