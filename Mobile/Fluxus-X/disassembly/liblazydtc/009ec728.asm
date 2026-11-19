; i2a_ASN1_OBJECT @ 009ec728
009ec728	sub sp,sp,#0x90
009ec72c	stp x20,x19,[sp, #0x70]
009ec730	mov x20,x0
009ec734	str x23,[sp, #0x50]
009ec738	stp x22,x21,[sp, #0x60]
009ec73c	stp x29,x30,[sp, #0x80]
009ec740	add x29,sp,#0x80
009ec744	cbz x1,0x009ec7a8
009ec748	ldr x8,[x1, #0x18]
009ec74c	mov x21,x1
009ec750	cbz x8,0x009ec7a8
009ec754	mov x0,sp
009ec758	mov w1,#0x50
009ec75c	mov x2,x21
009ec760	mov w3,wzr
009ec764	bl 0x00c32500
009ec768	mov w19,w0
009ec76c	cmp w0,#0x50
009ec770	b.lt 0x009ec7dc
009ec774	orr w8,wzr,#0x7fffffff
009ec778	cmp w19,w8
009ec77c	b.ne 0x009ec7f8
009ec780	bl 0x00c342a0
009ec784	adrp x0,0x2b7000
009ec788	adrp x2,0x2a2000
009ec78c	add x0,x0,#0x892
009ec790	add x2,x2,#0x113
009ec794	mov w1,#0xc4
009ec798	bl 0x00c342b0
009ec79c	mov w0,#0xd
009ec7a0	mov w1,#0xe7
009ec7a4	b 0x009ec8b4
009ec7a8	adrp x1,0x29d000
009ec7ac	add x1,x1,#0xc23
009ec7b0	mov w2,#0x4
009ec7b4	mov x0,x20
009ec7b8	bl 0x00c34240
009ec7bc	mov w19,w0
009ec7c0	mov w0,w19
009ec7c4	ldp x29,x30,[sp, #0x80]
009ec7c8	ldp x20,x19,[sp, #0x70]
009ec7cc	ldp x22,x21,[sp, #0x60]
009ec7d0	ldr x23,[sp, #0x50]
009ec7d4	add sp,sp,#0x90
009ec7d8	ret
009ec7dc	cmp w19,#0x1
009ec7e0	b.lt 0x009ec85c
009ec7e4	mov x1,sp
009ec7e8	mov x0,x20
009ec7ec	mov w2,w19
009ec7f0	bl 0x00c34240
009ec7f4	b 0x009ec7c0
009ec7f8	add w23,w19,#0x1
009ec7fc	adrp x1,0x2b7000
009ec800	sxtw x0,w23
009ec804	add x1,x1,#0x892
009ec808	mov w2,#0xc7
009ec80c	bl 0x00c32320
009ec810	cbz x0,0x009ec88c
009ec814	mov w1,w23
009ec818	mov x2,x21
009ec81c	mov w3,wzr
009ec820	mov x22,x0
009ec824	bl 0x00c32500
009ec828	mov x0,x20
009ec82c	mov x1,x22
009ec830	mov w2,w19
009ec834	bl 0x00c34240
009ec838	mov x8,sp
009ec83c	cmp x22,x8
009ec840	b.eq 0x009ec7c0
009ec844	adrp x1,0x2b7000
009ec848	add x1,x1,#0x892
009ec84c	mov w2,#0xd4
009ec850	mov x0,x22
009ec854	bl 0x00c32310
009ec858	b 0x009ec7c0
009ec85c	adrp x1,0x2b5000
009ec860	add x1,x1,#0xa2d
009ec864	mov w2,#0x9
009ec868	mov x0,x20
009ec86c	bl 0x00c34240
009ec870	ldr x1,[x21, #0x18]
009ec874	ldr w2,[x21, #0x14]
009ec878	mov w19,w0
009ec87c	mov x0,x20
009ec880	bl 0x00c376d0
009ec884	add w19,w0,w19
009ec888	b 0x009ec7c0
009ec88c	bl 0x00c342a0
009ec890	adrp x0,0x2b7000
009ec894	adrp x2,0x2a2000
009ec898	add x0,x0,#0x892
009ec89c	add x2,x2,#0x113
009ec8a0	mov w1,#0xc8
009ec8a4	bl 0x00c342b0
009ec8a8	mov w1,#0x100
009ec8ac	mov w0,#0xd
009ec8b0	movk w1,#0xc, LSL #16
009ec8b4	mov x2,xzr
009ec8b8	bl 0x00c342c0
009ec8bc	mov w19,#0xffffffff
009ec8c0	b 0x009ec7c0
