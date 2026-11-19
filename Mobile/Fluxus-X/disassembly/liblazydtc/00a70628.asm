; evp_pkey_ctx_ctrl_str_to_param @ 00a70628
00a70628	sub sp,sp,#0x170
00a7062c	stp x22,x21,[sp, #0x140]
00a70630	stp x20,x19,[sp, #0x150]
00a70634	mov x20,x2
00a70638	mov x21,x1
00a7063c	mov x19,x0
00a70640	add x0,sp,#0x90
00a70644	mov w2,#0x90
00a70648	mov w1,wzr
00a7064c	stp x28,x25,[sp, #0x120]
00a70650	stp x24,x23,[sp, #0x130]
00a70654	stp x29,x30,[sp, #0x160]
00a70658	add x29,sp,#0x160
00a7065c	bl 0x00c301c0
00a70660	movi v0.2D,#0x0
00a70664	mov x0,sp
00a70668	mov w2,#0x50
00a7066c	mov w1,wzr
00a70670	stp q0,q0,[sp, #0x70]
00a70674	str q0,[sp, #0x60]
00a70678	mov x24,sp
00a7067c	bl 0x00c301c0
00a70680	ldr w8,[x19]
00a70684	ldr w9,[x19, #0x74]
00a70688	adrp x1,0xc5e000
00a7068c	mov w25,#0x2
00a70690	cmp w8,#0x0
00a70694	csinv w8,w8,wzr,ne
00a70698	add x1,x1,#0xc98
00a7069c	add x0,sp,#0x50
00a706a0	mov w2,#0x55
00a706a4	stp w25,w9,[sp, #0x50]
00a706a8	stp w9,w8,[sp, #0x58]
00a706ac	stp x21,x21,[sp, #0x68]
00a706b0	bl 0x00a70be0
00a706b4	adrp x23,0xa6f000
00a706b8	mov x22,x0
00a706bc	add x23,x23,#0xd84
00a706c0	cbz x0,0x00a706e4
00a706c4	ldr x8,[x22, #0x38]
00a706c8	ldr x9,[sp, #0x70]
00a706cc	ldr w25,[x22]
00a706d0	cmp x8,#0x0
00a706d4	csel x23,x23,x8,eq
00a706d8	cmp x9,#0x0
00a706dc	cset w8,ne
00a706e0	str w8,[sp, #0xa8]
00a706e4	mov x0,x20
00a706e8	str w25,[sp, #0x98]
00a706ec	str x21,[sp, #0xa0]
00a706f0	bl 0x00c2ff50
00a706f4	str w0,[sp, #0xac]
00a706f8	mov w0,#0x4
00a706fc	add x2,sp,#0x90
00a70700	mov x1,x22
00a70704	str x20,[sp, #0xb0]
00a70708	str x19,[sp, #0x90]
00a7070c	str x24,[sp, #0xc0]
00a70710	blr x23
00a70714	cmp w0,#0x1
00a70718	b.lt 0x00a7074c
00a7071c	ldr w8,[sp, #0x98]
00a70720	cmp w8,#0x2
00a70724	b.ne 0x00a7073c
00a70728	ldr x1,[sp, #0xc0]
00a7072c	mov x0,x19
00a70730	bl 0x00c3c120
00a70734	cmp w0,#0x1
00a70738	b.lt 0x00a7074c
00a7073c	mov w0,#0x5
00a70740	add x2,sp,#0x90
00a70744	mov x1,x22
00a70748	blr x23
00a7074c	mov w20,w0
00a70750	ldr x0,[sp, #0x108]
00a70754	cbz x0,0x00a70768
00a70758	adrp x1,0x2b9000
00a7075c	add x1,x1,#0xe99
00a70760	mov w2,#0x2cb
00a70764	bl 0x00c32310
00a70768	mov w0,w20
00a7076c	ldp x29,x30,[sp, #0x160]
00a70770	ldp x20,x19,[sp, #0x150]
00a70774	ldp x22,x21,[sp, #0x140]
00a70778	ldp x24,x23,[sp, #0x130]
00a7077c	ldp x28,x25,[sp, #0x120]
00a70780	add sp,sp,#0x170
00a70784	ret
