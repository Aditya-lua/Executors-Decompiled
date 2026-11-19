; FUN_00a3d000 @ 00a3d000
00a3d000	sub sp,sp,#0x30
00a3d004	stp x20,x19,[sp, #0x10]
00a3d008	mov x20,x0
00a3d00c	add x0,sp,#0x8
00a3d010	add x1,sp,#0x4
00a3d014	mov x2,xzr
00a3d018	stp x29,x30,[sp, #0x20]
00a3d01c	add x29,sp,#0x20
00a3d020	mov x19,x5
00a3d024	bl 0x00c32b50
00a3d028	ldr x0,[sp, #0x8]
00a3d02c	bl 0x00c37750
00a3d030	sub w8,w0,#0x43f
00a3d034	cmp w8,#0x1
00a3d038	b.hi 0x00a3d070
00a3d03c	ldr w8,[sp, #0x4]
00a3d040	cmn w8,#0x1
00a3d044	b.ne 0x00a3d070
00a3d048	mov x0,x20
00a3d04c	mov x1,xzr
00a3d050	mov x2,xzr
00a3d054	mov x3,xzr
00a3d058	mov x4,x19
00a3d05c	bl 0x00c3b2b0
00a3d060	cmp w0,#0x0
00a3d064	mov w8,#0x2
00a3d068	csel w0,wzr,w8,eq
00a3d06c	b 0x00a3d0a0
00a3d070	bl 0x00c342a0
00a3d074	adrp x0,0x2aa000
00a3d078	adrp x2,0x2cd000
00a3d07c	add x0,x0,#0x129
00a3d080	add x2,x2,#0x9a8
00a3d084	mov w1,#0x22a
00a3d088	bl 0x00c342b0
00a3d08c	mov w0,#0x10
00a3d090	mov w1,#0x66
00a3d094	mov x2,xzr
00a3d098	bl 0x00c342c0
00a3d09c	mov w0,wzr
00a3d0a0	ldp x29,x30,[sp, #0x20]
00a3d0a4	ldp x20,x19,[sp, #0x10]
00a3d0a8	add sp,sp,#0x30
00a3d0ac	ret
