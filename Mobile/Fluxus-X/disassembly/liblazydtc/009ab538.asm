; ssl3_final_finish_mac @ 009ab538
009ab538	sub sp,sp,#0xf0
009ab53c	stp x24,x23,[sp, #0xb0]
009ab540	mov x23,x1
009ab544	mov w1,wzr
009ab548	str x25,[sp, #0xa0]
009ab54c	stp x22,x21,[sp, #0xc0]
009ab550	stp x20,x19,[sp, #0xd0]
009ab554	stp x29,x30,[sp, #0xe0]
009ab558	add x29,sp,#0xe0
009ab55c	mov x21,x3
009ab560	mov x22,x2
009ab564	mov x19,x0
009ab568	bl 0x009ab364
009ab56c	cbz w0,0x009ab668
009ab570	ldr x0,[x19, #0x190]
009ab574	bl 0x00c34c00
009ab578	bl 0x00c34c30
009ab57c	cmp w0,#0x72
009ab580	b.ne 0x009ab670
009ab584	bl 0x00c31fa0
009ab588	cbz x0,0x009ab698
009ab58c	ldr x1,[x19, #0x190]
009ab590	mov x20,x0
009ab594	bl 0x00c34bf0
009ab598	cbz w0,0x009ab6d8
009ab59c	mov x0,x20
009ab5a0	bl 0x00c34c00
009ab5a4	bl 0x00c34c20
009ab5a8	mov w24,w0
009ab5ac	tbnz w0,#0x1f,0x009ab6f4
009ab5b0	cbz x23,0x009ab72c
009ab5b4	ldr x8,[x19, #0x918]
009ab5b8	adrp x0,0x2b3000
009ab5bc	add x0,x0,#0xc71
009ab5c0	sub x25,x29,#0x68
009ab5c4	ldr x2,[x8, #0x8]
009ab5c8	add x1,x8,#0x50
009ab5cc	sub x8,x29,#0x68
009ab5d0	bl 0x00c34c50
009ab5d4	ldur x8,[x29, #-0x48]
009ab5d8	ldr q0,[x25, #0x10]
009ab5dc	ldur q1,[x29, #-0x68]
009ab5e0	str x8,[sp, #0x20]
009ab5e4	sub x8,x29,#0x68
009ab5e8	stp q1,q0,[sp]
009ab5ec	bl 0x00c34c40
009ab5f0	ldur x8,[x29, #-0x48]
009ab5f4	ldr q0,[x25, #0x10]
009ab5f8	ldur q1,[x29, #-0x68]
009ab5fc	mov x0,x20
009ab600	mov x1,x23
009ab604	mov x2,x22
009ab608	str x8,[sp, #0x48]
009ab60c	stur q0,[sp, #0x38]
009ab610	stur q1,[sp, #0x28]
009ab614	bl 0x00c31f80
009ab618	cmp w0,#0x1
009ab61c	b.lt 0x009ab64c
009ab620	mov x1,sp
009ab624	mov x0,x20
009ab628	bl 0x00c34c10
009ab62c	cmp w0,#0x1
009ab630	b.lt 0x009ab64c
009ab634	mov x0,x20
009ab638	mov x1,x21
009ab63c	mov x2,xzr
009ab640	bl 0x00c31f60
009ab644	cmp w0,#0x0
009ab648	b.gt 0x009ab72c
009ab64c	bl 0x00c342a0
009ab650	adrp x0,0x2a3000
009ab654	adrp x2,0x2d7000
009ab658	add x0,x0,#0xb34
009ab65c	add x2,x2,#0x867
009ab660	mov w1,#0x1ce
009ab664	b 0x009ab70c
009ab668	mov x0,xzr
009ab66c	b 0x009ab738
009ab670	bl 0x00c342a0
009ab674	adrp x0,0x2a3000
009ab678	adrp x2,0x2d7000
009ab67c	add x0,x0,#0xb34
009ab680	add x2,x2,#0x867
009ab684	mov w1,#0x1b0
009ab688	bl 0x00c342b0
009ab68c	mov w1,#0x50
009ab690	mov w2,#0x144
009ab694	b 0x009ab6c4
009ab698	bl 0x00c342a0
009ab69c	adrp x0,0x2a3000
009ab6a0	adrp x2,0x2d7000
009ab6a4	add x0,x0,#0xb34
009ab6a8	add x2,x2,#0x867
009ab6ac	mov w1,#0x1b6
009ab6b0	bl 0x00c342b0
009ab6b4	mov w8,#0x103
009ab6b8	movk w8,#0xc, LSL #16
009ab6bc	sub w2,w8,#0x3
009ab6c0	mov w1,#0x50
009ab6c4	mov x0,x19
009ab6c8	mov x3,xzr
009ab6cc	bl 0x00c34410
009ab6d0	mov x0,xzr
009ab6d4	b 0x009ab738
009ab6d8	bl 0x00c342a0
009ab6dc	adrp x0,0x2a3000
009ab6e0	adrp x2,0x2d7000
009ab6e4	add x0,x0,#0xb34
009ab6e8	add x2,x2,#0x867
009ab6ec	mov w1,#0x1ba
009ab6f0	b 0x009ab70c
009ab6f4	bl 0x00c342a0
009ab6f8	adrp x0,0x2a3000
009ab6fc	adrp x2,0x2d7000
009ab700	add x0,x0,#0xb34
009ab704	add x2,x2,#0x867
009ab708	mov w1,#0x1c1
009ab70c	bl 0x00c342b0
009ab710	mov w2,#0x103
009ab714	mov w1,#0x50
009ab718	movk w2,#0xc, LSL #16
009ab71c	mov x0,x19
009ab720	mov x3,xzr
009ab724	bl 0x00c34410
009ab728	mov w24,wzr
009ab72c	mov x0,x20
009ab730	bl 0x00c31f90
009ab734	sxtw x0,w24
009ab738	ldp x29,x30,[sp, #0xe0]
009ab73c	ldp x20,x19,[sp, #0xd0]
009ab740	ldp x22,x21,[sp, #0xc0]
009ab744	ldp x24,x23,[sp, #0xb0]
009ab748	ldr x25,[sp, #0xa0]
009ab74c	add sp,sp,#0xf0
009ab750	ret
