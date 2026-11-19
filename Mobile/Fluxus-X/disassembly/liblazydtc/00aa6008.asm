; MD4_Init @ 00aa6008
00aa6008	str x19,[sp, #-0x20]!
00aa600c	mov x19,x0
00aa6010	add x0,x0,#0x10
00aa6014	mov w2,#0x4c
00aa6018	mov w1,wzr
00aa601c	stp x29,x30,[sp, #0x10]
00aa6020	add x29,sp,#0x10
00aa6024	bl 0x00c301c0
00aa6028	adrp x8,0x29c000
00aa602c	ldr q0,[x8, #0x2e0]
00aa6030	mov w0,#0x1
00aa6034	str q0,[x19]
00aa6038	ldp x29,x30,[sp, #0x10]
00aa603c	ldr x19,[sp], #0x20
00aa6040	ret
