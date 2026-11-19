; ix::WebSocketTransport::bufferedAmount @ 0099a6f8
0099a6f8	stp x20,x19,[sp, #-0x20]!
0099a6fc	stp x29,x30,[sp, #0x10]
0099a700	add x29,sp,#0x10
0099a704	add x20,x0,#0x68
0099a708	mov x19,x0
0099a70c	mov x0,x20
0099a710	bl 0x00c2ff10
0099a714	ldp x8,x9,[x19, #0x50]
0099a718	mov x0,x20
0099a71c	sub x19,x9,x8
0099a720	bl 0x00c2ff20
0099a724	ldp x29,x30,[sp, #0x10]
0099a728	mov x0,x19
0099a72c	ldp x20,x19,[sp], #0x20
0099a730	ret
