; EVP_PKEY_dup @ 00a6efa8
00a6efa8	stp x20,x19,[sp, #-0x20]!
00a6efac	stp x29,x30,[sp, #0x10]
00a6efb0	add x29,sp,#0x10
00a6efb4	cbz x0,0x00a6effc
00a6efb8	mov x20,x0
00a6efbc	bl 0x00a6edc4
00a6efc0	mov x19,x0
00a6efc4	cbz x0,0x00a6f0d0
00a6efc8	ldr w2,[x20]
00a6efcc	ldr x8,[x20, #0x60]
00a6efd0	cbz w2,0x00a6f030
00a6efd4	cbnz x8,0x00a6f034
00a6efd8	ldr x8,[x20, #0x8]
00a6efdc	cbz x8,0x00a6f074
00a6efe0	ldr x8,[x8, #0x130]
00a6efe4	cbz x8,0x00a6f074
00a6efe8	mov x0,x19
00a6efec	mov x1,x20
00a6eff0	blr x8
00a6eff4	cbnz w0,0x00a6f048
00a6eff8	b 0x00a6f0c4
00a6effc	bl 0x00c342a0
00a6f000	adrp x0,0x2c1000
00a6f004	adrp x2,0x29e000
00a6f008	add x0,x0,#0xcf9
00a6f00c	add x2,x2,#0x1df
00a6f010	mov w1,#0x68d
00a6f014	bl 0x00c342b0
00a6f018	mov w1,#0x102
00a6f01c	orr w0,wzr,#0x6
00a6f020	movk w1,#0xc, LSL #16
00a6f024	mov x2,xzr
00a6f028	bl 0x00c342c0
00a6f02c	b 0x00a6f0cc
00a6f030	cbz x8,0x00a6f048
00a6f034	mov w2,#0x87
00a6f038	mov x0,x19
00a6f03c	mov x1,x20
00a6f040	bl 0x00c3d2f0
00a6f044	cbz w0,0x00a6f0c4
00a6f048	add x1,x19,#0x50
00a6f04c	add x2,x20,#0x50
00a6f050	mov w0,#0x11
00a6f054	bl 0x00c356b0
00a6f058	cbz w0,0x00a6f0c4
00a6f05c	ldr x0,[x20, #0x40]
00a6f060	cbz x0,0x00a6f0d0
00a6f064	bl 0x00c3da30
00a6f068	str x0,[x19, #0x40]
00a6f06c	cbnz x0,0x00a6f0d0
00a6f070	b 0x00a6f0c4
00a6f074	ldr x8,[x20, #0x20]
00a6f078	cbnz x8,0x00a6f098
00a6f07c	mov w4,#0xffffffff
00a6f080	mov x0,x19
00a6f084	mov x1,xzr
00a6f088	mov x3,xzr
00a6f08c	mov x5,xzr
00a6f090	bl 0x00a6d2f4
00a6f094	cbnz w0,0x00a6f048
00a6f098	bl 0x00c342a0
00a6f09c	adrp x0,0x2c1000
00a6f0a0	adrp x2,0x29e000
00a6f0a4	add x0,x0,#0xcf9
00a6f0a8	add x2,x2,#0x1df
00a6f0ac	mov w1,#0x6a5
00a6f0b0	bl 0x00c342b0
00a6f0b4	orr w0,wzr,#0x6
00a6f0b8	orr w1,wzr,#0xe0
00a6f0bc	mov x2,xzr
00a6f0c0	bl 0x00c342c0
00a6f0c4	mov x0,x19
00a6f0c8	bl 0x00a6c7fc
00a6f0cc	mov x19,xzr
00a6f0d0	ldp x29,x30,[sp, #0x10]
00a6f0d4	mov x0,x19
00a6f0d8	ldp x20,x19,[sp], #0x20
00a6f0dc	ret
