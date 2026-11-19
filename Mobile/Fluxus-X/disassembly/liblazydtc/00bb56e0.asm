; HUF_decompress1X_DCtx_wksp @ 00bb56e0
00bb56e0	stp x29,x30,[sp, #-0x40]!
00bb56e4	str x23,[sp, #0x10]
00bb56e8	stp x22,x21,[sp, #0x20]
00bb56ec	stp x20,x19,[sp, #0x30]
00bb56f0	mov x29,sp
00bb56f4	cbz x2,0x00bb5708
00bb56f8	cmp x4,x2
00bb56fc	b.ls 0x00bb5710
00bb5700	mov x0,#-0x14
00bb5704	b 0x00bb5748
00bb5708	mov x0,#-0x46
00bb570c	b 0x00bb5748
00bb5710	b.ne 0x00bb5728
00bb5714	mov x0,x1
00bb5718	mov x1,x3
00bb571c	mov x19,x2
00bb5720	bl 0x00c2ffd0
00bb5724	b 0x00bb5744
00bb5728	cmp x4,#0x1
00bb572c	b.ne 0x00bb575c
00bb5730	ldrb w8,[x3]
00bb5734	mov x0,x1
00bb5738	mov x19,x2
00bb573c	mov w1,w8
00bb5740	bl 0x00c301c0
00bb5744	mov x0,x19
00bb5748	ldp x20,x19,[sp, #0x30]
00bb574c	ldr x23,[sp, #0x10]
00bb5750	ldp x22,x21,[sp, #0x20]
00bb5754	ldp x29,x30,[sp], #0x40
00bb5758	ret
00bb575c	cmp x4,x2
00bb5760	b.cs 0x00bb5774
00bb5764	lsl x8,x4,#0x4
00bb5768	udiv x8,x8,x2
00bb576c	mov w8,w8
00bb5770	b 0x00bb5778
00bb5774	mov w8,#0xf
00bb5778	adrp x9,0x789000
00bb577c	add x9,x9,#0x1ac
00bb5780	mov x19,x1
00bb5784	add x8,x9,x8, LSL #0x4
00bb5788	lsr x9,x2,#0x8
00bb578c	mov x20,x2
00bb5790	mov x21,x0
00bb5794	mov x22,x3
00bb5798	mov x1,x3
00bb579c	ldp w11,w10,[x8, #0x8]
00bb57a0	ldp w8,w12,[x8]
00bb57a4	mov x23,x4
00bb57a8	mov x2,x4
00bb57ac	mov x3,x5
00bb57b0	madd w10,w10,w9,w11
00bb57b4	mov x4,x6
00bb57b8	mov w5,w7
00bb57bc	madd w8,w12,w9,w8
00bb57c0	add w9,w10,w10, LSR #0x5
00bb57c4	cmp w9,w8
00bb57c8	b.cs 0x00bb5804
00bb57cc	bl 0x00c43520
00bb57d0	cmn x0,#0x78
00bb57d4	b.hi 0x00bb5748
00bb57d8	subs x3,x23,x0
00bb57dc	b.ls 0x00bb583c
00bb57e0	add x2,x22,x0
00bb57e4	mov x0,x19
00bb57e8	mov x1,x20
00bb57ec	mov x4,x21
00bb57f0	ldp x20,x19,[sp, #0x30]
00bb57f4	ldr x23,[sp, #0x10]
00bb57f8	ldp x22,x21,[sp, #0x20]
00bb57fc	ldp x29,x30,[sp], #0x40
00bb5800	b 0x00bb519c
00bb5804	bl 0x00c43510
00bb5808	cmn x0,#0x78
00bb580c	b.hi 0x00bb5748
00bb5810	subs x3,x23,x0
00bb5814	b.ls 0x00bb583c
00bb5818	add x2,x22,x0
00bb581c	mov x0,x19
00bb5820	mov x1,x20
00bb5824	mov x4,x21
00bb5828	ldp x20,x19,[sp, #0x30]
00bb582c	ldr x23,[sp, #0x10]
00bb5830	ldp x22,x21,[sp, #0x20]
00bb5834	ldp x29,x30,[sp], #0x40
00bb5838	b 0x00bb58e0
00bb583c	mov x0,#-0x48
00bb5840	b 0x00bb5748
