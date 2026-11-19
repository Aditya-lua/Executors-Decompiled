; mbedtls_sha256 @ 00bad64c
00bad64c	sub sp,sp,#0xf0
00bad650	stp x28,x27,[sp, #0x90]
00bad654	stp x26,x25,[sp, #0xa0]
00bad658	stp x24,x23,[sp, #0xb0]
00bad65c	stp x22,x21,[sp, #0xc0]
00bad660	stp x20,x19,[sp, #0xd0]
00bad664	stp x29,x30,[sp, #0xe0]
00bad668	add x29,sp,#0xe0
00bad66c	mrs x9,tpidr_el0
00bad670	ldr x8,[x9, #0x28]
00bad674	mov w22,w3
00bad678	mov x20,x1
00bad67c	mov x21,x0
00bad680	cmp w3,#0x1
00bad684	stur x8,[x29, #-0x58]
00bad688	b.ls 0x00bad694
00bad68c	mov w19,#0xffffff8c
00bad690	b 0x00bad7f4
00bad694	str x9,[sp, #0x10]
00bad698	mov w8,#0x9ed8
00bad69c	mov w9,#0xe667
00bad6a0	cmp w22,#0x0
00bad6a4	movk w8,#0xc105, LSL #16
00bad6a8	movk w9,#0x6a09, LSL #16
00bad6ac	mov w10,#0xd507
00bad6b0	mov w11,#0xae85
00bad6b4	csel w8,w9,w8,eq
00bad6b8	movk w10,#0x367c, LSL #16
00bad6bc	movk w11,#0xbb67, LSL #16
00bad6c0	mov w16,#0xb31
00bad6c4	str w8,[sp, #0xc]
00bad6c8	mov w8,#0x527f
00bad6cc	movk w16,#0xffc0, LSL #16
00bad6d0	movk w8,#0x510e, LSL #16
00bad6d4	csel w9,w11,w10,eq
00bad6d8	str w9,[sp, #0x8]
00bad6dc	mov w9,#0x1511
00bad6e0	mov w10,#0x688c
00bad6e4	mov w11,#0x8fa7
00bad6e8	csel w28,w8,w16,eq
00bad6ec	mov w8,#0xd9ab
00bad6f0	movk w9,#0x6858, LSL #16
00bad6f4	movk w10,#0x9b05, LSL #16
00bad6f8	movk w11,#0x64f9, LSL #16
00bad6fc	movk w8,#0x1f83, LSL #16
00bad700	mov w12,#0xdd17
00bad704	mov w13,#0xf372
00bad708	mov w14,#0x5939
00bad70c	mov w15,#0xf53a
00bad710	csel w19,w10,w9,eq
00bad714	mov w9,#0x4fa4
00bad718	csel w23,w8,w11,eq
00bad71c	mov w8,#0xcd19
00bad720	movk w12,#0x3070, LSL #16
00bad724	movk w13,#0x3c6e, LSL #16
00bad728	movk w14,#0xf70e, LSL #16
00bad72c	movk w15,#0xa54f, LSL #16
00bad730	mov x25,x2
00bad734	movk w9,#0xbefa, LSL #16
00bad738	movk w8,#0x5be0, LSL #16
00bad73c	add x0,sp,#0x18
00bad740	mov w2,#0x48
00bad744	mov w1,wzr
00bad748	csel w26,w13,w12,eq
00bad74c	csel w27,w15,w14,eq
00bad750	csel w24,w8,w9,eq
00bad754	bl 0x00c301c0
00bad758	ldr w8,[sp, #0xc]
00bad75c	stp w27,w28,[sp, #0x6c]
00bad760	stp w19,w23,[sp, #0x74]
00bad764	stp w24,w22,[sp, #0x7c]
00bad768	str w8,[sp, #0x60]
00bad76c	ldr w8,[sp, #0x8]
00bad770	stp w8,w26,[sp, #0x64]
00bad774	cbz x20,0x00bad7d4
00bad778	str w20,[sp, #0x58]
00bad77c	cmp x20,#0x40
00bad780	b.cc 0x00bad7c0
00bad784	mov x24,x20
00bad788	mov x22,x21
00bad78c	add x0,sp,#0x18
00bad790	mov x1,x22
00bad794	bl 0x00c434f0
00bad798	sub x24,x24,#0x40
00bad79c	cmp x24,#0x3f
00bad7a0	add x22,x22,#0x40
00bad7a4	b.hi 0x00bad78c
00bad7a8	and x8,x20,#-0x40
00bad7ac	add x21,x21,x8
00bad7b0	sub x20,x20,x8
00bad7b4	cbnz x8,0x00bad77c
00bad7b8	mov w19,#0xffffffff
00bad7bc	b 0x00bad7e4
00bad7c0	cbz x20,0x00bad7d4
00bad7c4	add x0,sp,#0x18
00bad7c8	mov x1,x21
00bad7cc	mov x2,x20
00bad7d0	bl 0x00c2ffd0
00bad7d4	add x0,sp,#0x18
00bad7d8	mov x1,x25
00bad7dc	bl 0x00c42a90
00bad7e0	mov w19,wzr
00bad7e4	add x0,sp,#0x18
00bad7e8	mov w1,#0x6c
00bad7ec	bl 0x00c42220
00bad7f0	ldr x9,[sp, #0x10]
00bad7f4	ldr x8,[x9, #0x28]
00bad7f8	ldur x9,[x29, #-0x58]
00bad7fc	cmp x8,x9
00bad800	b.ne 0x00bad828
00bad804	mov w0,w19
00bad808	ldp x29,x30,[sp, #0xe0]
00bad80c	ldp x20,x19,[sp, #0xd0]
00bad810	ldp x22,x21,[sp, #0xc0]
00bad814	ldp x24,x23,[sp, #0xb0]
00bad818	ldp x26,x25,[sp, #0xa0]
00bad81c	ldp x28,x27,[sp, #0x90]
00bad820	add sp,sp,#0xf0
00bad824	ret
00bad828	bl 0x00c2fec0
