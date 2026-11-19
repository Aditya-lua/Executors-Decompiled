; ssl_cipher_get_evp @ 009ae5b4
009ae5b4	sub sp,sp,#0x80
009ae5b8	stp x28,x27,[sp, #0x20]
009ae5bc	stp x26,x25,[sp, #0x30]
009ae5c0	stp x24,x23,[sp, #0x40]
009ae5c4	stp x22,x21,[sp, #0x50]
009ae5c8	stp x20,x19,[sp, #0x60]
009ae5cc	stp x29,x30,[sp, #0x70]
009ae5d0	ldr x22,[x1, #0x2f8]
009ae5d4	add x29,sp,#0x70
009ae5d8	cbz x22,0x009ae7e8
009ae5dc	mov w23,w7
009ae5e0	mov x27,x6
009ae5e4	mov x26,x5
009ae5e8	mov x25,x4
009ae5ec	mov x19,x3
009ae5f0	mov x20,x2
009ae5f4	mov x24,x1
009ae5f8	mov x21,x0
009ae5fc	cbz x6,0x009ae658
009ae600	adrp x0,0xd21000
009ae604	adrp x1,0x9b1000
009ae608	add x0,x0,#0x8c0
009ae60c	add x1,x1,#0x418
009ae610	bl 0x00c34d60
009ae614	str xzr,[x27]
009ae618	adrp x28,0xd21000
009ae61c	ldr w8,[x24, #0x2f4]
009ae620	ldr x0,[x28, #0x8b8]
009ae624	str w8,[sp, #0x8]
009ae628	cbz x0,0x009ae648
009ae62c	add x1,sp,#0x8
009ae630	bl 0x00c34760
009ae634	tbnz w0,#0x1f,0x009ae648
009ae638	mov w1,w0
009ae63c	ldr x0,[x28, #0x8b8]
009ae640	bl 0x00c32610
009ae644	str x0,[x27]
009ae648	cbnz x20,0x009ae658
009ae64c	cbnz x19,0x009ae658
009ae650	mov w0,#0x1
009ae654	b 0x009ae7ec
009ae658	cbz x20,0x009ae7e8
009ae65c	mov w0,wzr
009ae660	cbz x19,0x009ae7ec
009ae664	mov x0,x21
009ae668	mov x1,x22
009ae66c	mov x2,x20
009ae670	bl 0x009ae3c4
009ae674	cbz w0,0x009ae7ec
009ae678	ldr w8,[x22, #0x28]
009ae67c	cmp w8,#0x7f
009ae680	b.gt 0x009ae6b0
009ae684	cmp w8,#0x20
009ae688	b.hi 0x009ae80c
009ae68c	adrp x9,0x74b000
009ae690	mov w8,w8
009ae694	add x9,x9,#0x4a4
009ae698	ldrsw x8,[x9, x8, LSL #0x2]
009ae69c	mov x28,xzr
009ae6a0	add x8,x8,x9
009ae6a4	br x8
009ae6a8	mov w28,#0x9
009ae6ac	b 0x009ae72c
009ae6b0	cmp w8,#0x1ff
009ae6b4	b.le 0x009ae6d8
009ae6b8	cmp w8,#0x200
009ae6bc	b.eq 0x009ae718
009ae6c0	cmp w8,#0x400
009ae6c4	b.eq 0x009ae720
009ae6c8	cmp w8,#0x800
009ae6cc	b.ne 0x009ae80c
009ae6d0	mov w28,#0xd
009ae6d4	b 0x009ae72c
009ae6d8	cmp w8,#0x80
009ae6dc	b.eq 0x009ae728
009ae6e0	cmp w8,#0x100
009ae6e4	b.ne 0x009ae80c
009ae6e8	orr w28,wzr,#0x7
009ae6ec	b 0x009ae72c
009ae6f0	mov w28,#0x1
009ae6f4	b 0x009ae72c
009ae6f8	mov w28,#0x2
009ae6fc	b 0x009ae72c
009ae700	orr w28,wzr,#0x3
009ae704	b 0x009ae72c
009ae708	mov w28,#0x4
009ae70c	b 0x009ae72c
009ae710	mov w28,#0x5
009ae714	b 0x009ae72c
009ae718	mov w28,#0x8
009ae71c	b 0x009ae72c
009ae720	orr w28,wzr,#0xc
009ae724	b 0x009ae72c
009ae728	orr w28,wzr,#0x6
009ae72c	add x8,x21,x28, LSL #0x3
009ae730	ldr x27,[x8, #0x540]
009ae734	cbz x27,0x009ae7e0
009ae738	mov x0,x27
009ae73c	bl 0x00c35410
009ae740	cbz w0,0x009ae7e0
009ae744	str x27,[x19]
009ae748	cbz x25,0x009ae758
009ae74c	add x8,x21,x28, LSL #0x2
009ae750	ldr w8,[x8, #0x448]
009ae754	str w8,[x25]
009ae758	cbz x26,0x009ae768
009ae75c	add x8,x21,x28, LSL #0x3
009ae760	ldr x8,[x8, #0x5b0]
009ae764	str x8,[x26]
009ae768	ldr x0,[x20]
009ae76c	cbz x0,0x009ae7ec
009ae770	cbnz x27,0x009ae784
009ae774	bl 0x00c35280
009ae778	mov x8,x0
009ae77c	mov w0,wzr
009ae780	tbz w8,#0x15,0x009ae7ec
009ae784	cbz x25,0x009ae790
009ae788	ldr w8,[x25]
009ae78c	cbz w8,0x009ae7e8
009ae790	cbnz w23,0x009ae650
009ae794	ldr w8,[x24]
009ae798	mov w0,#0x1
009ae79c	cmp w8,#0x301
009ae7a0	b.lt 0x009ae7ec
009ae7a4	and w8,w8,#0xffffff00
009ae7a8	cmp w8,#0x300
009ae7ac	b.ne 0x009ae7ec
009ae7b0	ldr w8,[x22, #0x24]
009ae7b4	cmp w8,#0x80
009ae7b8	b.eq 0x009ae83c
009ae7bc	cmp w8,#0x40
009ae7c0	b.eq 0x009ae858
009ae7c4	cmp w8,#0x4
009ae7c8	b.ne 0x009ae650
009ae7cc	ldr w8,[x22, #0x28]
009ae7d0	cmp w8,#0x1
009ae7d4	b.ne 0x009ae650
009ae7d8	mov w1,#0x393
009ae7dc	b 0x009ae880
009ae7e0	ldr x0,[x20]
009ae7e4	bl 0x00c34970
009ae7e8	mov w0,wzr
009ae7ec	ldp x29,x30,[sp, #0x70]
009ae7f0	ldp x20,x19,[sp, #0x60]
009ae7f4	ldp x22,x21,[sp, #0x50]
009ae7f8	ldp x24,x23,[sp, #0x40]
009ae7fc	ldp x26,x25,[sp, #0x30]
009ae800	ldp x28,x27,[sp, #0x20]
009ae804	add sp,sp,#0x80
009ae808	ret
009ae80c	str xzr,[x19]
009ae810	cbz x25,0x009ae818
009ae814	str wzr,[x25]
009ae818	cbz x26,0x009ae820
009ae81c	str xzr,[x26]
009ae820	ldr w8,[x22, #0x28]
009ae824	mov x27,xzr
009ae828	cmp w8,#0x40
009ae82c	csel x25,xzr,x25,eq
009ae830	ldr x0,[x20]
009ae834	cbnz x0,0x009ae770
009ae838	b 0x009ae7ec
009ae83c	ldr w8,[x22, #0x28]
009ae840	cmp w8,#0x2
009ae844	b.eq 0x009ae874
009ae848	cmp w8,#0x10
009ae84c	b.ne 0x009ae650
009ae850	mov w1,#0x3b6
009ae854	b 0x009ae880
009ae858	ldr w8,[x22, #0x28]
009ae85c	cmp w8,#0x2
009ae860	b.eq 0x009ae87c
009ae864	cmp w8,#0x10
009ae868	b.ne 0x009ae650
009ae86c	mov w1,#0x3b4
009ae870	b 0x009ae880
009ae874	mov w1,#0x396
009ae878	b 0x009ae880
009ae87c	mov w1,#0x394
009ae880	ldr x0,[x21]
009ae884	ldr x2,[x21, #0x440]
009ae888	bl 0x00c353f0
009ae88c	cbz x0,0x009ae650
009ae890	mov x21,x0
009ae894	ldr x0,[x20]
009ae898	bl 0x00c34970
009ae89c	ldr x0,[x19]
009ae8a0	bl 0x00c34980
009ae8a4	str x21,[x20]
009ae8a8	str xzr,[x19]
009ae8ac	b 0x009ae650
