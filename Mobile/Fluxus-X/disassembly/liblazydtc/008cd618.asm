; FUN_008cd618 @ 008cd618
008cd618	sub sp,sp,#0x40
008cd61c	stp x29,x30,[sp, #0x10]
008cd620	stp x22,x21,[sp, #0x20]
008cd624	stp x20,x19,[sp, #0x30]
008cd628	add x29,sp,#0x10
008cd62c	ldr w8,[x2, #0xc]
008cd630	mov x21,x2
008cd634	mov x19,x1
008cd638	cmp w8,#0x5
008cd63c	b.eq 0x008cd698
008cd640	mov x20,x0
008cd644	cmp w8,#0x6
008cd648	b.ne 0x008cd6b4
008cd64c	ldr x0,[x21]
008cd650	ldr x8,[x0, #0x10]
008cd654	cbz x8,0x008cd68c
008cd658	ldrb w9,[x8, #0x6]
008cd65c	tbnz w9,#0x6,0x008cd68c
008cd660	ldrb w9,[x8, #0x7]
008cd664	tbnz w9,#0x1,0x008cd720
008cd668	ldr x9,[x20, #0x60]
008cd66c	mov x22,x0
008cd670	mov x0,x8
008cd674	mov w1,#0x6
008cd678	ldr x2,[x9, #0x368]
008cd67c	bl 0x008bdfe0
008cd680	mov x2,x0
008cd684	mov x0,x22
008cd688	cbnz x2,0x008cd6c8
008cd68c	bl 0x008bcf64
008cd690	scvtf d0,w0
008cd694	b 0x008cd6a4
008cd698	ldr x8,[x21]
008cd69c	ldr s0,[x8, #0x14]
008cd6a0	ucvtf d0,d0
008cd6a4	mov w8,#0x3
008cd6a8	str d0,[x19]
008cd6ac	str w8,[x19, #0xc]
008cd6b0	b 0x008cd70c
008cd6b4	mov x0,x20
008cd6b8	mov x1,x21
008cd6bc	mov w2,#0x6
008cd6c0	bl 0x008be028
008cd6c4	mov x2,x0
008cd6c8	ldr w8,[x2, #0xc]
008cd6cc	cbz w8,0x008cd730
008cd6d0	adrp x8,0xd1f000
008cd6d4	add x8,x8,#0x1e0
008cd6d8	ldarb w9,[x8]
008cd6dc	adrp x8,0xd1f000
008cd6e0	tbz w9,#0x0,0x008cd744
008cd6e4	ldr x8,[x8, #0x1d8]
008cd6e8	mov x0,x20
008cd6ec	mov x1,x19
008cd6f0	mov x3,x21
008cd6f4	add x8,x8,#0x7f2, LSL #12
008cd6f8	add x4,x8,#0xef0
008cd6fc	bl 0x008cb070
008cd700	ldr w8,[x0, #0xc]
008cd704	cmp w8,#0x3
008cd708	b.ne 0x008cd78c
008cd70c	ldp x20,x19,[sp, #0x30]
008cd710	ldp x22,x21,[sp, #0x20]
008cd714	ldp x29,x30,[sp, #0x10]
008cd718	add sp,sp,#0x40
008cd71c	ret
008cd720	ldr x8,[x8, #0x20]
008cd724	sub x2,x8,#0x70
008cd728	ldr w8,[x2, #0xc]
008cd72c	cbnz w8,0x008cd6d0
008cd730	adrp x2,0x2ba000
008cd734	add x2,x2,#0xf8b
008cd738	mov x0,x20
008cd73c	mov x1,x21
008cd740	bl 0x008b399c
008cd744	adrp x0,0xd1f000
008cd748	add x0,x0,#0x1e0
008cd74c	str x2,[sp, #0x8]
008cd750	bl 0x00c2fe90
008cd754	ldr x2,[sp, #0x8]
008cd758	adrp x8,0xd1f000
008cd75c	cbz w0,0x008cd6e4
008cd760	adrp x8,0xcca000
008cd764	ldr x0,[x8, #0x8c8]
008cd768	bl 0x007fe1ec
008cd76c	adrp x22,0xd1f000
008cd770	str x0,[x22, #0x1d8]
008cd774	adrp x0,0xd1f000
008cd778	add x0,x0,#0x1e0
008cd77c	bl 0x00c2fea0
008cd780	ldr x2,[sp, #0x8]
008cd784	mov x8,x22
008cd788	b 0x008cd6e4
008cd78c	adrp x1,0x2a7000
008cd790	add x1,x1,#0x1d8
008cd794	mov x0,x20
008cd798	bl 0x008b39cc
