; CT_POLICY_EVAL_CTX_free @ 00a13ab8
00a13ab8	cbz x0,0x00a13b0c
00a13abc	stp x20,x19,[sp, #-0x20]!
00a13ac0	stp x29,x30,[sp, #0x10]
00a13ac4	mov x19,x0
00a13ac8	ldr x0,[x0]
00a13acc	add x29,sp,#0x10
00a13ad0	bl 0x00c31a90
00a13ad4	ldr x0,[x19, #0x8]
00a13ad8	bl 0x00c31a90
00a13adc	ldr x0,[x19, #0x28]
00a13ae0	adrp x20,0x29e000
00a13ae4	add x20,x20,#0x9
00a13ae8	mov w2,#0x42
00a13aec	mov x1,x20
00a13af0	bl 0x00c32310
00a13af4	ldp x29,x30,[sp, #0x10]
00a13af8	mov w2,#0x43
00a13afc	mov x0,x19
00a13b00	mov x1,x20
00a13b04	ldp x20,x19,[sp], #0x20
00a13b08	b 0x00c32310
00a13b0c	ret
