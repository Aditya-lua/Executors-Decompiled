; ossl_sa_set @ 00ac56b4
00ac56b4	stp x26,x25,[sp, #-0x50]!
00ac56b8	stp x24,x23,[sp, #0x10]
00ac56bc	stp x22,x21,[sp, #0x20]
00ac56c0	stp x20,x19,[sp, #0x30]
00ac56c4	stp x29,x30,[sp, #0x40]
00ac56c8	add x29,sp,#0x40
00ac56cc	cbz x0,0x00ac58c0
00ac56d0	mov x19,x2
00ac56d4	mov x21,x1
00ac56d8	mov x20,x0
00ac56dc	cmp x1,#0x10
00ac56e0	b.cs 0x00ac56ec
00ac56e4	mov w23,#0x1
00ac56e8	b 0x00ac57cc
00ac56ec	cmp x21,#0xff
00ac56f0	b.hi 0x00ac56fc
00ac56f4	mov w23,#0x2
00ac56f8	b 0x00ac57cc
00ac56fc	cmp x21,#0x1, LSL #12
00ac5700	b.cs 0x00ac570c
00ac5704	orr w23,wzr,#0x3
00ac5708	b 0x00ac57cc
00ac570c	cmp x21,#0x10, LSL #12
00ac5710	b.cs 0x00ac571c
00ac5714	mov w23,#0x4
00ac5718	b 0x00ac57cc
00ac571c	cmp x21,#0x100, LSL #12
00ac5720	b.cs 0x00ac572c
00ac5724	mov w23,#0x5
00ac5728	b 0x00ac57cc
00ac572c	lsr x8,x21,#0x18
00ac5730	cbnz x8,0x00ac573c
00ac5734	orr w23,wzr,#0x6
00ac5738	b 0x00ac57cc
00ac573c	lsr x8,x21,#0x1c
00ac5740	cbnz x8,0x00ac574c
00ac5744	orr w23,wzr,#0x7
00ac5748	b 0x00ac57cc
00ac574c	lsr x8,x21,#0x20
00ac5750	cbnz x8,0x00ac575c
00ac5754	mov w23,#0x8
00ac5758	b 0x00ac57cc
00ac575c	lsr x8,x21,#0x24
00ac5760	cbnz x8,0x00ac576c
00ac5764	mov w23,#0x9
00ac5768	b 0x00ac57cc
00ac576c	lsr x8,x21,#0x28
00ac5770	cbnz x8,0x00ac577c
00ac5774	mov w23,#0xa
00ac5778	b 0x00ac57cc
00ac577c	lsr x8,x21,#0x2c
00ac5780	cbnz x8,0x00ac578c
00ac5784	mov w23,#0xb
00ac5788	b 0x00ac57cc
00ac578c	lsr x8,x21,#0x30
00ac5790	cbnz x8,0x00ac579c
00ac5794	orr w23,wzr,#0xc
00ac5798	b 0x00ac57cc
00ac579c	lsr x8,x21,#0x34
00ac57a0	cbnz x8,0x00ac57ac
00ac57a4	mov w23,#0xd
00ac57a8	b 0x00ac57cc
00ac57ac	lsr x8,x21,#0x38
00ac57b0	cbnz x8,0x00ac57bc
00ac57b4	orr w23,wzr,#0xe
00ac57b8	b 0x00ac57cc
00ac57bc	lsr x8,x21,#0x3c
00ac57c0	cmp x8,#0x0
00ac57c4	orr w8,wzr,#0xf
00ac57c8	cinc w23,w8,ne
00ac57cc	ldr w8,[x20]
00ac57d0	cmp w8,w23
00ac57d4	b.ge 0x00ac5814
00ac57d8	adrp x22,0x2dc000
00ac57dc	add x22,x22,#0x89f
00ac57e0	mov w0,#0x80
00ac57e4	mov w2,#0xb0
00ac57e8	mov x1,x22
00ac57ec	bl 0x00c34250
00ac57f0	cbz x0,0x00ac58c0
00ac57f4	ldr x8,[x20, #0x18]
00ac57f8	str x8,[x0]
00ac57fc	ldr w8,[x20]
00ac5800	str x0,[x20, #0x18]
00ac5804	add w8,w8,#0x1
00ac5808	cmp w8,w23
00ac580c	str w8,[x20]
00ac5810	b.lt 0x00ac57e0
00ac5814	ldr x9,[x20, #0x8]
00ac5818	cmp x9,x21
00ac581c	b.cs 0x00ac5824
00ac5820	str x21,[x20, #0x8]
00ac5824	ldr x23,[x20, #0x18]
00ac5828	cmp w8,#0x2
00ac582c	b.lt 0x00ac588c
00ac5830	mov w9,w8
00ac5834	lsl w8,w8,#0x2
00ac5838	adrp x22,0x2dc000
00ac583c	add x24,x9,#0x1
00ac5840	sub w25,w8,#0x4
00ac5844	add x22,x22,#0x89f
00ac5848	mov w8,w25
00ac584c	lsr x8,x21,x8
00ac5850	and x26,x8,#0xf
00ac5854	ldr x0,[x23, x26, LSL #0x3]
00ac5858	cbnz x0,0x00ac5874
00ac585c	mov w0,#0x80
00ac5860	mov w2,#0xb0
00ac5864	mov x1,x22
00ac5868	bl 0x00c34250
00ac586c	str x0,[x23, x26, LSL #0x3]
00ac5870	cbz x0,0x00ac58c0
00ac5874	sub x24,x24,#0x1
00ac5878	cmp x24,#0x2
00ac587c	sub w25,w25,#0x4
00ac5880	mov x23,x0
00ac5884	b.gt 0x00ac5848
00ac5888	mov x23,x0
00ac588c	and x8,x21,#0xf
00ac5890	ldr x9,[x23, x8, LSL #0x3]
00ac5894	cbz x19,0x00ac58a8
00ac5898	cbnz x9,0x00ac58b8
00ac589c	ldr x9,[x20, #0x10]
00ac58a0	add x9,x9,#0x1
00ac58a4	b 0x00ac58b4
00ac58a8	cbz x9,0x00ac58b8
00ac58ac	ldr x9,[x20, #0x10]
00ac58b0	sub x9,x9,#0x1
00ac58b4	str x9,[x20, #0x10]
00ac58b8	mov w0,#0x1
00ac58bc	str x19,[x23, x8, LSL #0x3]
00ac58c0	ldp x29,x30,[sp, #0x40]
00ac58c4	ldp x20,x19,[sp, #0x30]
00ac58c8	ldp x22,x21,[sp, #0x20]
00ac58cc	ldp x24,x23,[sp, #0x10]
00ac58d0	ldp x26,x25,[sp], #0x50
00ac58d4	ret
