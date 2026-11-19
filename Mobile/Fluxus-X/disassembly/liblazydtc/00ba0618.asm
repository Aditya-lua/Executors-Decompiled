; mbedtls_ecjpake_setup @ 00ba0618
00ba0618	str x23,[sp, #-0x40]!
00ba061c	stp x22,x21,[sp, #0x10]
00ba0620	stp x20,x19,[sp, #0x20]
00ba0624	stp x29,x30,[sp, #0x30]
00ba0628	add x29,sp,#0x30
00ba062c	mov x20,x5
00ba0630	mov x21,x4
00ba0634	mov w22,w3
00ba0638	mov w23,w2
00ba063c	cmp w1,#0x1
00ba0640	mov x19,x0
00ba0644	b.ls 0x00ba0650
00ba0648	mov w22,#0xffffb080
00ba064c	b 0x00ba06a0
00ba0650	mov w0,w23
00ba0654	str w1,[x19, #0xc8]
00ba0658	bl 0x00c30210
00ba065c	cbz x0,0x00ba069c
00ba0660	mov x0,x19
00ba0664	str w23,[x0], #0x8
00ba0668	mov w1,w22
00ba066c	bl 0x00c42800
00ba0670	mov w22,w0
00ba0674	cbnz w0,0x00ba0690
00ba0678	add x0,x19,#0x1e0
00ba067c	mov x1,x21
00ba0680	mov x2,x20
00ba0684	bl 0x00c41ca0
00ba0688	mov w22,w0
00ba068c	cbz w0,0x00ba06a0
00ba0690	mov x0,x19
00ba0694	bl 0x00c42590
00ba0698	b 0x00ba06a0
00ba069c	mov w22,#0xffffaf80
00ba06a0	mov w0,w22
00ba06a4	ldp x29,x30,[sp, #0x30]
00ba06a8	ldp x20,x19,[sp, #0x20]
00ba06ac	ldp x22,x21,[sp, #0x10]
00ba06b0	ldr x23,[sp], #0x40
00ba06b4	ret
