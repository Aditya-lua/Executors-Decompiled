; X509_to_X509_REQ @ 00b0bfa4
00b0bfa4	stp x22,x21,[sp, #-0x30]!
00b0bfa8	stp x20,x19,[sp, #0x10]
00b0bfac	stp x29,x30,[sp, #0x20]
00b0bfb0	mov x22,x0
00b0bfb4	ldr x8,[x22, #0x178]
00b0bfb8	ldr x0,[x0, #0x170]
00b0bfbc	mov x21,x1
00b0bfc0	add x29,sp,#0x20
00b0bfc4	mov x1,x8
00b0bfc8	mov x20,x2
00b0bfcc	bl 0x00c40c90
00b0bfd0	mov x19,x0
00b0bfd4	cbz x0,0x00b0c058
00b0bfd8	ldr x8,[x19, #0x18]
00b0bfdc	adrp x1,0x2a4000
00b0bfe0	mov w9,#0x1
00b0bfe4	add x1,x1,#0xaf5
00b0bfe8	mov w0,#0x1
00b0bfec	mov w2,#0x26
00b0bff0	str w9,[x8]
00b0bff4	bl 0x00c32320
00b0bff8	ldr x8,[x19, #0x18]
00b0bffc	str x0,[x8, #0x8]
00b0c000	cbz x0,0x00b0c088
00b0c004	strb wzr,[x0]
00b0c008	mov x0,x22
00b0c00c	bl 0x00c32d20
00b0c010	mov x1,x0
00b0c014	mov x0,x19
00b0c018	bl 0x00c40cb0
00b0c01c	cbz w0,0x00b0c088
00b0c020	mov x0,x22
00b0c024	bl 0x00c32cb0
00b0c028	cbz x0,0x00b0c088
00b0c02c	mov x1,x0
00b0c030	mov x0,x19
00b0c034	bl 0x00c40ca0
00b0c038	cbz w0,0x00b0c088
00b0c03c	cbz x21,0x00b0c094
00b0c040	mov x0,x19
00b0c044	mov x1,x21
00b0c048	mov x2,x20
00b0c04c	bl 0x00c40cc0
00b0c050	cbnz w0,0x00b0c094
00b0c054	b 0x00b0c088
00b0c058	bl 0x00c342a0
00b0c05c	adrp x0,0x2a4000
00b0c060	adrp x2,0x2b6000
00b0c064	add x0,x0,#0xaf5
00b0c068	add x2,x2,#0x5ea
00b0c06c	orr w1,wzr,#0x1f
00b0c070	bl 0x00c342b0
00b0c074	mov w1,#0x100
00b0c078	mov w0,#0xb
00b0c07c	movk w1,#0xc, LSL #16
00b0c080	mov x2,xzr
00b0c084	bl 0x00c342c0
00b0c088	mov x0,x19
00b0c08c	bl 0x00c40c80
00b0c090	mov x19,xzr
00b0c094	mov x0,x19
00b0c098	ldp x29,x30,[sp, #0x20]
00b0c09c	ldp x20,x19,[sp, #0x10]
00b0c0a0	ldp x22,x21,[sp], #0x30
00b0c0a4	ret
