; ossl_rand_pool_add_additional_data @ 00b5bfd0
00b5bfd0	sub sp,sp,#0x50
00b5bfd4	str x19,[sp, #0x30]
00b5bfd8	stp x29,x30,[sp, #0x40]
00b5bfdc	add x29,sp,#0x40
00b5bfe0	mov x19,x0
00b5bfe4	stp xzr,xzr,[sp, #0x8]
00b5bfe8	str xzr,[sp, #0x18]
00b5bfec	bl 0x00c3ecd0
00b5bff0	str w0,[sp, #0x8]
00b5bff4	bl 0x00c3ecb0
00b5bff8	str x0,[sp, #0x10]
00b5bffc	bl 0x00c3e010
00b5c000	cbz w0,0x00b5c00c
00b5c004	mov w0,w0
00b5c008	b 0x00b5c040
00b5c00c	orr w0,wzr,#0x7
00b5c010	add x1,sp,#0x20
00b5c014	bl 0x00c308e0
00b5c018	cbz w0,0x00b5c038
00b5c01c	add x0,sp,#0x20
00b5c020	mov x1,xzr
00b5c024	bl 0x00c31ff0
00b5c028	cbz w0,0x00b5c038
00b5c02c	mov x0,xzr
00b5c030	bl 0x00c30970
00b5c034	b 0x00b5c040
00b5c038	ldp x8,x9,[sp, #0x20]
00b5c03c	add x0,x9,x8, LSL #0x20
00b5c040	str x0,[sp, #0x18]
00b5c044	add x1,sp,#0x8
00b5c048	orr w2,wzr,#0x18
00b5c04c	mov x0,x19
00b5c050	mov x3,xzr
00b5c054	bl 0x00c3f8d0
00b5c058	ldp x29,x30,[sp, #0x40]
00b5c05c	ldr x19,[sp, #0x30]
00b5c060	add sp,sp,#0x50
00b5c064	ret
