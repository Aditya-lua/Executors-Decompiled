; ossl_rsa_sp800_56b_derive_params_from_pq @ 00adb414
00adb414	str x27,[sp, #-0x60]!
00adb418	stp x22,x21,[sp, #0x30]
00adb41c	mov x21,x0
00adb420	mov x0,x3
00adb424	stp x26,x25,[sp, #0x10]
00adb428	stp x24,x23,[sp, #0x20]
00adb42c	stp x20,x19,[sp, #0x40]
00adb430	stp x29,x30,[sp, #0x50]
00adb434	add x29,sp,#0x50
00adb438	mov x19,x3
00adb43c	mov x27,x2
00adb440	mov w26,w1
00adb444	bl 0x00c38a90
00adb448	mov x0,x19
00adb44c	bl 0x00c38a40
00adb450	mov x20,x0
00adb454	mov x0,x19
00adb458	bl 0x00c38a40
00adb45c	mov x22,x0
00adb460	mov x0,x19
00adb464	bl 0x00c38a40
00adb468	mov x23,x0
00adb46c	mov x0,x19
00adb470	bl 0x00c38a40
00adb474	mov x24,x0
00adb478	mov x0,x19
00adb47c	bl 0x00c38a40
00adb480	mov x25,x0
00adb484	cbz x0,0x00adb624
00adb488	mov w1,#0x4
00adb48c	mov x0,x20
00adb490	bl 0x00c38dc0
00adb494	mov w1,#0x4
00adb498	mov x0,x22
00adb49c	bl 0x00c38dc0
00adb4a0	mov w1,#0x4
00adb4a4	mov x0,x23
00adb4a8	bl 0x00c38dc0
00adb4ac	mov w1,#0x4
00adb4b0	mov x0,x24
00adb4b4	bl 0x00c38dc0
00adb4b8	mov w1,#0x4
00adb4bc	mov x0,x25
00adb4c0	bl 0x00c38dc0
00adb4c4	ldp x1,x2,[x21, #0x40]
00adb4c8	mov x0,x19
00adb4cc	mov x3,x23
00adb4d0	mov x4,x25
00adb4d4	mov x5,x20
00adb4d8	mov x6,x22
00adb4dc	mov x7,x24
00adb4e0	bl 0x00c40080
00adb4e4	cmp w0,#0x1
00adb4e8	b.ne 0x00adb624
00adb4ec	ldr x0,[x21, #0x30]
00adb4f0	bl 0x00c36290
00adb4f4	mov x0,x27
00adb4f8	bl 0x00c369a0
00adb4fc	str x0,[x21, #0x30]
00adb500	cbz x0,0x00adb624
00adb504	ldr x0,[x21, #0x38]
00adb508	bl 0x00c322e0
00adb50c	bl 0x00c38d90
00adb510	str x0,[x21, #0x38]
00adb514	cbz x0,0x00adb624
00adb518	mov w1,#0x4
00adb51c	bl 0x00c38dc0
00adb520	ldr x0,[x21, #0x38]
00adb524	mov x1,x27
00adb528	mov x2,x23
00adb52c	mov x3,x19
00adb530	bl 0x00c38b20
00adb534	cbz x0,0x00adb624
00adb538	ldr x0,[x21, #0x38]
00adb53c	bl 0x00c322f0
00adb540	cmp w0,w26, ASR #0x1
00adb544	mov w26,wzr
00adb548	b.le 0x00adb628
00adb54c	ldr x0,[x21, #0x28]
00adb550	cbnz x0,0x00adb560
00adb554	bl 0x00c37710
00adb558	str x0,[x21, #0x28]
00adb55c	cbz x0,0x00adb624
00adb560	ldp x1,x2,[x21, #0x40]
00adb564	mov x3,x19
00adb568	bl 0x00c39060
00adb56c	cbz w0,0x00adb624
00adb570	ldr x0,[x21, #0x50]
00adb574	cbnz x0,0x00adb584
00adb578	bl 0x00c38d90
00adb57c	str x0,[x21, #0x50]
00adb580	cbz x0,0x00adb624
00adb584	mov w1,#0x4
00adb588	bl 0x00c38dc0
00adb58c	ldr x1,[x21, #0x50]
00adb590	ldr x2,[x21, #0x38]
00adb594	mov x0,xzr
00adb598	mov x3,x20
00adb59c	mov x4,x19
00adb5a0	bl 0x00c38ab0
00adb5a4	cbz w0,0x00adb624
00adb5a8	ldr x0,[x21, #0x58]
00adb5ac	cbnz x0,0x00adb5bc
00adb5b0	bl 0x00c38d90
00adb5b4	str x0,[x21, #0x58]
00adb5b8	cbz x0,0x00adb624
00adb5bc	mov w1,#0x4
00adb5c0	bl 0x00c38dc0
00adb5c4	ldr x1,[x21, #0x58]
00adb5c8	ldr x2,[x21, #0x38]
00adb5cc	mov x0,xzr
00adb5d0	mov x3,x22
00adb5d4	mov x4,x19
00adb5d8	bl 0x00c38ab0
00adb5dc	cbz w0,0x00adb624
00adb5e0	ldr x0,[x21, #0x60]
00adb5e4	bl 0x00c36290
00adb5e8	bl 0x00c38d90
00adb5ec	str x0,[x21, #0x60]
00adb5f0	cbz x0,0x00adb624
00adb5f4	mov w1,#0x4
00adb5f8	bl 0x00c38dc0
00adb5fc	ldr x0,[x21, #0x60]
00adb600	ldp x2,x1,[x21, #0x40]
00adb604	mov x3,x19
00adb608	bl 0x00c38b20
00adb60c	cbz x0,0x00adb624
00adb610	ldr w8,[x21, #0xd8]
00adb614	mov w26,#0x1
00adb618	add w8,w8,#0x1
00adb61c	str w8,[x21, #0xd8]
00adb620	b 0x00adb670
00adb624	mov w26,#0xffffffff
00adb628	ldr x0,[x21, #0x30]
00adb62c	bl 0x00c36290
00adb630	ldr x0,[x21, #0x38]
00adb634	str xzr,[x21, #0x30]
00adb638	bl 0x00c36290
00adb63c	ldr x0,[x21, #0x28]
00adb640	str xzr,[x21, #0x38]
00adb644	bl 0x00c36290
00adb648	ldr x0,[x21, #0x60]
00adb64c	str xzr,[x21, #0x28]
00adb650	bl 0x00c36290
00adb654	ldr x0,[x21, #0x58]
00adb658	str xzr,[x21, #0x60]
00adb65c	bl 0x00c36290
00adb660	ldr x0,[x21, #0x50]
00adb664	str xzr,[x21, #0x58]
00adb668	bl 0x00c36290
00adb66c	str xzr,[x21, #0x50]
00adb670	mov x0,x20
00adb674	bl 0x00c38ca0
00adb678	mov x0,x22
00adb67c	bl 0x00c38ca0
00adb680	mov x0,x23
00adb684	bl 0x00c38ca0
00adb688	mov x0,x24
00adb68c	bl 0x00c38ca0
00adb690	mov x0,x25
00adb694	bl 0x00c38ca0
00adb698	mov x0,x19
00adb69c	bl 0x00c38a20
00adb6a0	mov w0,w26
00adb6a4	ldp x29,x30,[sp, #0x50]
00adb6a8	ldp x20,x19,[sp, #0x40]
00adb6ac	ldp x22,x21,[sp, #0x30]
00adb6b0	ldp x24,x23,[sp, #0x20]
00adb6b4	ldp x26,x25,[sp, #0x10]
00adb6b8	ldr x27,[sp], #0x60
00adb6bc	ret
