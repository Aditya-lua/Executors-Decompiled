; FUN_00af9744 @ 00af9744
00af9744	sub sp,sp,#0x70
00af9748	stp x28,x27,[sp, #0x10]
00af974c	stp x26,x25,[sp, #0x20]
00af9750	stp x24,x23,[sp, #0x30]
00af9754	stp x22,x21,[sp, #0x40]
00af9758	stp x20,x19,[sp, #0x50]
00af975c	stp x29,x30,[sp, #0x60]
00af9760	add x29,sp,#0x60
00af9764	cbz x0,0x00af9980
00af9768	ldr w8,[x0]
00af976c	mov x21,x0
00af9770	cbz w8,0x00af9980
00af9774	cmp w8,#0x1
00af9778	b.ne 0x00af9988
00af977c	ldr x0,[x21, #0x8]
00af9780	bl 0x00c325e0
00af9784	cbz w0,0x00af9988
00af9788	ldr x0,[x21, #0x8]
00af978c	bl 0x00c35350
00af9790	ldr x0,[x21, #0x8]
00af9794	bl 0x00c325e0
00af9798	ldr x8,[x21, #0x8]
00af979c	cmp w0,#0x2
00af97a0	b.lt 0x00af99bc
00af97a4	mov x28,xzr
00af97a8	mov x19,xzr
00af97ac	mov w22,wzr
00af97b0	mov x0,x8
00af97b4	mov w1,w22
00af97b8	bl 0x00c32610
00af97bc	mov x27,x0
00af97c0	ldr x0,[x21, #0x8]
00af97c4	add w25,w22,#0x1
00af97c8	mov w1,w25
00af97cc	bl 0x00c32610
00af97d0	cbz x27,0x00af9a98
00af97d4	ldr w8,[x27]
00af97d8	mov x26,x0
00af97dc	str x28,[sp, #0x8]
00af97e0	cmp w8,#0x1
00af97e4	b.eq 0x00af97fc
00af97e8	cbnz w8,0x00af9a98
00af97ec	ldr x20,[x27, #0x8]
00af97f0	mov x28,x20
00af97f4	cbnz x26,0x00af9808
00af97f8	b 0x00af9a60
00af97fc	ldr x8,[x27, #0x8]
00af9800	ldp x20,x28,[x8]
00af9804	cbz x26,0x00af9a60
00af9808	ldr w8,[x26]
00af980c	cmp w8,#0x1
00af9810	b.eq 0x00af9824
00af9814	cbnz w8,0x00af9a60
00af9818	ldr x24,[x26, #0x8]
00af981c	mov x23,x24
00af9820	b 0x00af982c
00af9824	ldr x8,[x26, #0x8]
00af9828	ldp x24,x23,[x8]
00af982c	mov x0,x20
00af9830	mov x1,x24
00af9834	bl 0x00c37560
00af9838	cmp w0,#0x0
00af983c	b.gt 0x00af9a60
00af9840	mov x0,x20
00af9844	mov x1,x28
00af9848	bl 0x00c37560
00af984c	cmp w0,#0x0
00af9850	b.gt 0x00af9a60
00af9854	mov x0,x24
00af9858	mov x1,x23
00af985c	bl 0x00c37560
00af9860	cmp w0,#0x0
00af9864	b.gt 0x00af9a60
00af9868	mov x0,x28
00af986c	mov x1,x24
00af9870	bl 0x00c37560
00af9874	tbz w0,#0x1f,0x00af9a34
00af9878	cbnz x19,0x00af9888
00af987c	bl 0x00c37710
00af9880	mov x19,x0
00af9884	cbz x0,0x00af9a14
00af9888	mov x0,x28
00af988c	mov x1,x19
00af9890	bl 0x00c375e0
00af9894	cbz x0,0x00af9a14
00af9898	mov w1,#0x1
00af989c	mov x0,x19
00af98a0	bl 0x00c376e0
00af98a4	ldr x28,[sp, #0x8]
00af98a8	cbz w0,0x00af9a18
00af98ac	mov x0,x19
00af98b0	mov x1,x28
00af98b4	bl 0x00c375f0
00af98b8	cbz x0,0x00af9a68
00af98bc	mov x1,x24
00af98c0	mov x28,x0
00af98c4	bl 0x00c37560
00af98c8	cbz w0,0x00af98d4
00af98cc	mov w22,w25
00af98d0	b 0x00af9964
00af98d4	ldr w8,[x27]
00af98d8	cmp w8,#0x1
00af98dc	b.eq 0x00af9910
00af98e0	cbnz w8,0x00af9924
00af98e4	adrp x1,0x2c2000
00af98e8	mov w0,#0x10
00af98ec	mov w2,#0x1c4
00af98f0	add x1,x1,#0x4d4
00af98f4	bl 0x00c32320
00af98f8	cbz x0,0x00af9ad0
00af98fc	mov w8,#0x1
00af9900	stp x20,x23,[x0]
00af9904	str w8,[x27]
00af9908	str x0,[x27, #0x8]
00af990c	b 0x00af9924
00af9910	ldr x8,[x27, #0x8]
00af9914	ldr x0,[x8, #0x8]
00af9918	bl 0x00c37c30
00af991c	ldr x8,[x27, #0x8]
00af9920	str x23,[x8, #0x8]
00af9924	ldr w8,[x26]
00af9928	cmp w8,#0x1
00af992c	b.eq 0x00af993c
00af9930	cbnz w8,0x00af9948
00af9934	add x8,x26,#0x8
00af9938	b 0x00af9944
00af993c	ldr x8,[x26, #0x8]
00af9940	add x8,x8,#0x8
00af9944	str xzr,[x8]
00af9948	adrp x1,0xc7e000
00af994c	mov x0,x26
00af9950	add x1,x1,#0xb88
00af9954	bl 0x00c36160
00af9958	ldr x0,[x21, #0x8]
00af995c	mov w1,w25
00af9960	bl 0x00c35320
00af9964	ldr x0,[x21, #0x8]
00af9968	bl 0x00c325e0
00af996c	ldr x8,[x21, #0x8]
00af9970	sub w9,w0,#0x1
00af9974	cmp w22,w9
00af9978	b.lt 0x00af97b0
00af997c	b 0x00af99c4
00af9980	mov w20,#0x1
00af9984	b 0x00af9aac
00af9988	bl 0x00c342a0
00af998c	adrp x0,0x2c2000
00af9990	adrp x2,0x2a0000
00af9994	add x0,x0,#0x4d4
00af9998	add x2,x2,#0xce5
00af999c	orr w1,wzr,#0x180
00af99a0	bl 0x00c342b0
00af99a4	mov w0,#0x22
00af99a8	mov w1,#0x74
00af99ac	mov x2,xzr
00af99b0	bl 0x00c342c0
00af99b4	mov w20,wzr
00af99b8	b 0x00af9aac
00af99bc	mov x19,xzr
00af99c0	mov x28,xzr
00af99c4	mov x0,x8
00af99c8	bl 0x00c325e0
00af99cc	ldr x8,[x21, #0x8]
00af99d0	sub w1,w0,#0x1
00af99d4	mov x0,x8
00af99d8	bl 0x00c32610
00af99dc	cbz x0,0x00af9a00
00af99e0	ldr w8,[x0]
00af99e4	cmp w8,#0x1
00af99e8	b.ne 0x00af9a00
00af99ec	ldr x8,[x0, #0x8]
00af99f0	ldp x0,x1,[x8]
00af99f4	bl 0x00c37560
00af99f8	cmp w0,#0x0
00af99fc	b.gt 0x00af9a98
00af9a00	mov x0,x21
00af9a04	bl 0x00af94bc
00af9a08	cmp w0,#0x0
00af9a0c	cset w20,ne
00af9a10	b 0x00af9a9c
00af9a14	ldr x28,[sp, #0x8]
00af9a18	bl 0x00c342a0
00af9a1c	adrp x0,0x2c2000
00af9a20	adrp x2,0x2a0000
00af9a24	add x0,x0,#0x4d4
00af9a28	add x2,x2,#0xce5
00af9a2c	mov w1,#0x1b2
00af9a30	b 0x00af9a80
00af9a34	bl 0x00c342a0
00af9a38	adrp x0,0x2c2000
00af9a3c	adrp x2,0x2a0000
00af9a40	add x0,x0,#0x4d4
00af9a44	add x2,x2,#0xce5
00af9a48	mov w1,#0x1a8
00af9a4c	bl 0x00c342b0
00af9a50	mov w0,#0x22
00af9a54	mov w1,#0x74
00af9a58	mov x2,xzr
00af9a5c	bl 0x00c342c0
00af9a60	ldr x28,[sp, #0x8]
00af9a64	b 0x00af9a98
00af9a68	bl 0x00c342a0
00af9a6c	adrp x0,0x2c2000
00af9a70	adrp x2,0x2a0000
00af9a74	add x0,x0,#0x4d4
00af9a78	add x2,x2,#0xce5
00af9a7c	mov w1,#0x1b9
00af9a80	bl 0x00c342b0
00af9a84	mov w1,#0x100
00af9a88	mov w0,#0x22
00af9a8c	movk w1,#0xc, LSL #16
00af9a90	mov x2,xzr
00af9a94	bl 0x00c342c0
00af9a98	mov w20,wzr
00af9a9c	mov x0,x28
00af9aa0	bl 0x00c37c30
00af9aa4	mov x0,x19
00af9aa8	bl 0x00c36290
00af9aac	mov w0,w20
00af9ab0	ldp x29,x30,[sp, #0x60]
00af9ab4	ldp x20,x19,[sp, #0x50]
00af9ab8	ldp x22,x21,[sp, #0x40]
00af9abc	ldp x24,x23,[sp, #0x30]
00af9ac0	ldp x26,x25,[sp, #0x20]
00af9ac4	ldp x28,x27,[sp, #0x10]
00af9ac8	add sp,sp,#0x70
00af9acc	ret
00af9ad0	bl 0x00c342a0
00af9ad4	adrp x0,0x2c2000
00af9ad8	adrp x2,0x2a0000
00af9adc	add x0,x0,#0x4d4
00af9ae0	add x2,x2,#0xce5
00af9ae4	mov w1,#0x1c5
00af9ae8	b 0x00af9a80
