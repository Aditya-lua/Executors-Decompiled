; FUN_0090fba8 @ 0090fba8
0090fba8	stp x20,x19,[sp, #-0x20]!
0090fbac	stp x29,x30,[sp, #0x10]
0090fbb0	add x29,sp,#0x10
0090fbb4	ldr x8,[x0, #0xd0]
0090fbb8	mov x19,x0
0090fbbc	cbz x8,0x0090fbf0
0090fbc0	mov w1,#0x5
0090fbc4	mov w2,#0x2
0090fbc8	mov x0,x19
0090fbcc	bl 0x0093f628
0090fbd0	ldr x8,[x19, #0xc38]
0090fbd4	ldr x9,[x19, #0xd0]
0090fbd8	ldr x20,[x8, #0x30]
0090fbdc	cbz x9,0x0090fbf8
0090fbe0	mov w1,#0x5
0090fbe4	mov x0,x19
0090fbe8	bl 0x0093f680
0090fbec	b 0x0090fbf8
0090fbf0	ldr x8,[x19, #0xc38]
0090fbf4	ldr x20,[x8, #0x30]
0090fbf8	ldp x29,x30,[sp, #0x10]
0090fbfc	mov x0,x20
0090fc00	ldp x20,x19,[sp], #0x20
0090fc04	ret
