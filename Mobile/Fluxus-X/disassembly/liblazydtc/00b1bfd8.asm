; FUN_00b1bfd8 @ 00b1bfd8
00b1bfd8	stp x20,x19,[sp, #-0x20]!
00b1bfdc	adrp x1,0x2c6000
00b1bfe0	mov x20,x0
00b1bfe4	add x1,x1,#0x46b
00b1bfe8	mov w0,#0x28
00b1bfec	mov w2,#0x5c
00b1bff0	stp x29,x30,[sp, #0x10]
00b1bff4	add x29,sp,#0x10
00b1bff8	bl 0x00c34250
00b1bffc	cbz x0,0x00b1c02c
00b1c000	mov x19,x0
00b1c004	bl 0x00c34780
00b1c008	str x0,[x19]
00b1c00c	cbz x0,0x00b1c060
00b1c010	bl 0x00c37020
00b1c014	str x0,[x19, #0x10]
00b1c018	cbz x0,0x00b1c060
00b1c01c	mov w0,#0x1
00b1c020	str w0,[x19, #0x8]
00b1c024	str x19,[x20]
00b1c028	b 0x00b1c0b0
00b1c02c	bl 0x00c342a0
00b1c030	adrp x0,0x2c6000
00b1c034	adrp x2,0x2ac000
00b1c038	add x0,x0,#0x46b
00b1c03c	add x2,x2,#0x958
00b1c040	mov w1,#0x69
00b1c044	bl 0x00c342b0
00b1c048	mov w1,#0x100
00b1c04c	mov w0,#0xd
00b1c050	movk w1,#0xc, LSL #16
00b1c054	mov x2,xzr
00b1c058	bl 0x00c342c0
00b1c05c	b 0x00b1c0ac
00b1c060	bl 0x00c342a0
00b1c064	adrp x20,0x2c6000
00b1c068	add x20,x20,#0x46b
00b1c06c	adrp x2,0x2ac000
00b1c070	add x2,x2,#0x958
00b1c074	mov w1,#0x69
00b1c078	mov x0,x20
00b1c07c	bl 0x00c342b0
00b1c080	mov w1,#0x100
00b1c084	mov w0,#0xd
00b1c088	movk w1,#0xc, LSL #16
00b1c08c	mov x2,xzr
00b1c090	bl 0x00c342c0
00b1c094	ldr x0,[x19]
00b1c098	bl 0x00c34770
00b1c09c	mov w2,#0x6c
00b1c0a0	mov x0,x19
00b1c0a4	mov x1,x20
00b1c0a8	bl 0x00c32310
00b1c0ac	mov w0,wzr
00b1c0b0	ldp x29,x30,[sp, #0x10]
00b1c0b4	ldp x20,x19,[sp], #0x20
00b1c0b8	ret
