; FUN_00ba76c0 @ 00ba76c0
00ba76c0	sub sp,sp,#0xd0
00ba76c4	stp x28,x27,[sp, #0x70]
00ba76c8	stp x26,x25,[sp, #0x80]
00ba76cc	stp x24,x23,[sp, #0x90]
00ba76d0	stp x22,x21,[sp, #0xa0]
00ba76d4	stp x20,x19,[sp, #0xb0]
00ba76d8	stp x29,x30,[sp, #0xc0]
00ba76dc	add x29,sp,#0xc0
00ba76e0	mrs x25,tpidr_el0
00ba76e4	ldr x8,[x25, #0x28]
00ba76e8	mov x22,x0
00ba76ec	add x0,sp,#0x8
00ba76f0	mov w23,w4
00ba76f4	mov x19,x3
00ba76f8	mov x20,x2
00ba76fc	mov x21,x1
00ba7700	stur x8,[x29, #-0x58]
00ba7704	bl 0x00c42840
00ba7708	mov w0,w23
00ba770c	bl 0x00c30210
00ba7710	mov x24,x0
00ba7714	cbz x0,0x00ba7884
00ba7718	add x0,sp,#0x8
00ba771c	bl 0x00c42840
00ba7720	add x0,sp,#0x8
00ba7724	mov x1,x24
00ba7728	mov w2,wzr
00ba772c	bl 0x00c42850
00ba7730	mov w23,w0
00ba7734	cbnz w0,0x00ba786c
00ba7738	mov x0,x24
00ba773c	bl 0x00c302d0
00ba7740	stp xzr,xzr,[sp, #0x58]
00ba7744	stp xzr,xzr,[sp, #0x48]
00ba7748	stp xzr,xzr,[sp, #0x38]
00ba774c	stp xzr,xzr,[sp, #0x28]
00ba7750	str wzr,[sp, #0x24]
00ba7754	cbz x21,0x00ba7868
00ba7758	add x26,sp,#0x28
00ba775c	and x24,x0,#0xff
00ba7760	add x27,x26,#0x10
00ba7764	cmp x21,x24
00ba7768	add x0,sp,#0x8
00ba776c	csel x28,x21,x24,cc
00ba7770	bl 0x00c42860
00ba7774	mov w23,w0
00ba7778	cbnz w0,0x00ba786c
00ba777c	add x0,sp,#0x8
00ba7780	mov x1,x20
00ba7784	mov x2,x19
00ba7788	bl 0x00c42870
00ba778c	mov w23,w0
00ba7790	cbnz w0,0x00ba786c
00ba7794	add x0,sp,#0x8
00ba7798	add x1,sp,#0x24
00ba779c	mov w2,#0x4
00ba77a0	bl 0x00c42870
00ba77a4	mov w23,w0
00ba77a8	cbnz w0,0x00ba786c
00ba77ac	add x0,sp,#0x8
00ba77b0	add x1,sp,#0x28
00ba77b4	bl 0x00c42820
00ba77b8	mov w23,w0
00ba77bc	cbnz w0,0x00ba786c
00ba77c0	cbz x28,0x00ba7854
00ba77c4	mov x8,xzr
00ba77c8	cmp x28,#0x20
00ba77cc	mov x9,x22
00ba77d0	b.cc 0x00ba7834
00ba77d4	add x8,x26,x28
00ba77d8	cmp x22,x8
00ba77dc	b.cs 0x00ba77f4
00ba77e0	add x9,x22,x28
00ba77e4	mov x8,xzr
00ba77e8	cmp x26,x9
00ba77ec	mov x9,x22
00ba77f0	b.cc 0x00ba7834
00ba77f4	and x8,x28,#0xe0
00ba77f8	add x9,x22,x8
00ba77fc	add x10,x22,#0x10
00ba7800	mov x11,x8
00ba7804	mov x12,x27
00ba7808	ldp q0,q1,[x12, #-0x10]
00ba780c	ldp q2,q3,[x10, #-0x10]
00ba7810	subs x11,x11,#0x20
00ba7814	add x12,x12,#0x20
00ba7818	eor v0.16B,v2.16B,v0.16B
00ba781c	eor v1.16B,v3.16B,v1.16B
00ba7820	stp q0,q1,[x10, #-0x10]
00ba7824	add x10,x10,#0x20
00ba7828	b.ne 0x00ba7808
00ba782c	cmp x28,x8
00ba7830	b.eq 0x00ba7850
00ba7834	ldrb w10,[x26, x8]
00ba7838	ldrb w11,[x9]
00ba783c	add x8,x8,#0x1
00ba7840	cmp x8,x28
00ba7844	eor w10,w11,w10
00ba7848	strb w10,[x9], #0x1
00ba784c	b.cc 0x00ba7834
00ba7850	add x22,x22,x28
00ba7854	ldrb w8,[sp, #0x27]
00ba7858	subs x21,x21,x28
00ba785c	add w8,w8,#0x1
00ba7860	strb w8,[sp, #0x27]
00ba7864	b.ne 0x00ba7764
00ba7868	mov w23,wzr
00ba786c	add x0,sp,#0x28
00ba7870	mov w1,#0x40
00ba7874	bl 0x00c42220
00ba7878	add x0,sp,#0x8
00ba787c	bl 0x00c42830
00ba7880	b 0x00ba7888
00ba7884	mov w23,#0xffffbf80
00ba7888	ldr x8,[x25, #0x28]
00ba788c	ldur x9,[x29, #-0x58]
00ba7890	cmp x8,x9
00ba7894	b.ne 0x00ba78bc
00ba7898	mov w0,w23
00ba789c	ldp x29,x30,[sp, #0xc0]
00ba78a0	ldp x20,x19,[sp, #0xb0]
00ba78a4	ldp x22,x21,[sp, #0xa0]
00ba78a8	ldp x24,x23,[sp, #0x90]
00ba78ac	ldp x26,x25,[sp, #0x80]
00ba78b0	ldp x28,x27,[sp, #0x70]
00ba78b4	add sp,sp,#0xd0
00ba78b8	ret
00ba78bc	bl 0x00c2fec0
