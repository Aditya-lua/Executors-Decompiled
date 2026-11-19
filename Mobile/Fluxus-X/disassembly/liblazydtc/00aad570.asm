; OBJ_NAME_add @ 00aad570
00aad570	stp x22,x21,[sp, #-0x30]!
00aad574	mov w22,w1
00aad578	mov x21,x0
00aad57c	adrp x0,0xd22000
00aad580	adrp x1,0xaad000
00aad584	add x0,x0,#0x160
00aad588	add x1,x1,#0x21c
00aad58c	stp x20,x19,[sp, #0x10]
00aad590	stp x29,x30,[sp, #0x20]
00aad594	add x29,sp,#0x20
00aad598	mov x20,x2
00aad59c	bl 0x00c34d60
00aad5a0	mov w19,wzr
00aad5a4	cbz w0,0x00aad6a8
00aad5a8	adrp x8,0xd22000
00aad5ac	ldr w8,[x8, #0x164]
00aad5b0	cbz w8,0x00aad6a8
00aad5b4	adrp x1,0x2b2000
00aad5b8	add x1,x1,#0x57b
00aad5bc	orr w0,wzr,#0x18
00aad5c0	mov w2,#0xc8
00aad5c4	bl 0x00c32320
00aad5c8	mov x19,x0
00aad5cc	cbz x0,0x00aad6a8
00aad5d0	adrp x8,0x29b000
00aad5d4	ldr d0,[x8, #0xea0]
00aad5d8	dup v1.2S,w22
00aad5dc	stp x21,x20,[x19, #0x8]
00aad5e0	adrp x21,0xd22000
00aad5e4	and v0.8B,v1.8B,v0.8B
00aad5e8	str d0,[x19]
00aad5ec	ldr x0,[x21, #0x168]
00aad5f0	bl 0x00c356a0
00aad5f4	cbz w0,0x00aad660
00aad5f8	adrp x22,0xd22000
00aad5fc	ldr x0,[x22, #0x178]
00aad600	mov x1,x19
00aad604	bl 0x00c34dc0
00aad608	cbz x0,0x00aad67c
00aad60c	adrp x19,0xd22000
00aad610	mov x20,x0
00aad614	ldr x0,[x19, #0x170]
00aad618	cbz x0,0x00aad644
00aad61c	bl 0x00c325e0
00aad620	ldr w1,[x20]
00aad624	cmp w0,w1
00aad628	b.le 0x00aad644
00aad62c	ldr x0,[x19, #0x170]
00aad630	bl 0x00c32610
00aad634	ldr x8,[x0, #0x10]
00aad638	ldr w1,[x20]
00aad63c	ldp x0,x2,[x20, #0x8]
00aad640	blr x8
00aad644	adrp x1,0x2b2000
00aad648	add x1,x1,#0x57b
00aad64c	mov w2,#0xe3
00aad650	mov x0,x20
00aad654	bl 0x00c32310
00aad658	mov w19,#0x1
00aad65c	b 0x00aad6a0
00aad660	adrp x1,0x2b2000
00aad664	add x1,x1,#0x57b
00aad668	mov w2,#0xd2
00aad66c	mov x0,x19
00aad670	bl 0x00c32310
00aad674	mov w19,wzr
00aad678	b 0x00aad6a8
00aad67c	ldr x0,[x22, #0x178]
00aad680	bl 0x00c395f0
00aad684	cbz w0,0x00aad658
00aad688	adrp x1,0x2b2000
00aad68c	add x1,x1,#0x57b
00aad690	mov w2,#0xe7
00aad694	mov x0,x19
00aad698	bl 0x00c32310
00aad69c	mov w19,wzr
00aad6a0	ldr x0,[x21, #0x168]
00aad6a4	bl 0x00c35690
00aad6a8	mov w0,w19
00aad6ac	ldp x29,x30,[sp, #0x20]
00aad6b0	ldp x20,x19,[sp, #0x10]
00aad6b4	ldp x22,x21,[sp], #0x30
00aad6b8	ret
