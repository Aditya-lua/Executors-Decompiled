; FUN_00b4af9c @ 00b4af9c
00b4af9c	stp x20,x19,[sp, #-0x20]!
00b4afa0	mov x8,x1
00b4afa4	adrp x1,0x2d7000
00b4afa8	mov x20,x0
00b4afac	add x1,x1,#0xe7d
00b4afb0	mov x0,x8
00b4afb4	stp x29,x30,[sp, #0x10]
00b4afb8	add x29,sp,#0x10
00b4afbc	bl 0x00c3e8c0
00b4afc0	cbz x0,0x00b4afe4
00b4afc4	mov x19,x0
00b4afc8	add x0,x20,#0x8
00b4afcc	bl 0x00c41160
00b4afd0	cbz x0,0x00b4aff4
00b4afd4	bl 0x00c34c20
00b4afd8	sxtw x8,w0
00b4afdc	bic x1,x8,x8, ASR #0x3f
00b4afe0	b 0x00b4b024
00b4afe4	ldp x29,x30,[sp, #0x10]
00b4afe8	orr w0,wzr,#0xfffffffe
00b4afec	ldp x20,x19,[sp], #0x20
00b4aff0	ret
00b4aff4	bl 0x00c342a0
00b4aff8	adrp x0,0x2ae000
00b4affc	adrp x2,0x2b0000
00b4b000	add x0,x0,#0xb4d
00b4b004	add x2,x2,#0xe58
00b4b008	mov w1,#0x186
00b4b00c	bl 0x00c342b0
00b4b010	mov w0,#0x39
00b4b014	mov w1,#0x81
00b4b018	mov x2,xzr
00b4b01c	bl 0x00c342c0
00b4b020	mov x1,xzr
00b4b024	ldp x29,x30,[sp, #0x10]
00b4b028	mov x0,x19
00b4b02c	ldp x20,x19,[sp], #0x20
00b4b030	b 0x00c3e950
