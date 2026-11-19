; ix::createSelectInterrupt @ 0098569c
0098569c	stp x20,x19,[sp, #-0x20]!
009856a0	stp x29,x30,[sp, #0x10]
009856a4	add x29,sp,#0x10
009856a8	orr w0,wzr,#0x38
009856ac	mov x19,x8
009856b0	bl 0x00c2fed0
009856b4	mov x20,x0
009856b8	bl 0x00c334a0
009856bc	ldp x29,x30,[sp, #0x10]
009856c0	str x20,[x19]
009856c4	ldp x20,x19,[sp], #0x20
009856c8	ret
