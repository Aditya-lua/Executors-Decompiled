; PEM_read_bio_ECPrivateKey @ 00ab5024
00ab5024	str x21,[sp, #-0x30]!
00ab5028	stp x20,x19,[sp, #0x10]
00ab502c	mov x19,x1
00ab5030	mov x1,xzr
00ab5034	stp x29,x30,[sp, #0x20]
00ab5038	add x29,sp,#0x20
00ab503c	bl 0x00c32640
00ab5040	cbz x0,0x00ab5070
00ab5044	mov x21,x0
00ab5048	bl 0x00c3d8e0
00ab504c	mov x20,x0
00ab5050	mov x0,x21
00ab5054	bl 0x00c32450
00ab5058	cbz x20,0x00ab5074
00ab505c	cbz x19,0x00ab5074
00ab5060	ldr x0,[x19]
00ab5064	bl 0x00c3a7c0
00ab5068	str x20,[x19]
00ab506c	b 0x00ab5074
00ab5070	mov x20,xzr
00ab5074	mov x0,x20
00ab5078	ldp x29,x30,[sp, #0x20]
00ab507c	ldp x20,x19,[sp, #0x10]
00ab5080	ldr x21,[sp], #0x30
00ab5084	ret
