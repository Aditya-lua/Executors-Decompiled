; EVP_RAND_CTX_new @ 00ac9790
00ac9790	stp x24,x23,[sp, #-0x40]!
00ac9794	stp x22,x21,[sp, #0x10]
00ac9798	stp x20,x19,[sp, #0x20]
00ac979c	stp x29,x30,[sp, #0x30]
00ac97a0	add x29,sp,#0x30
00ac97a4	cbz x0,0x00ac983c
00ac97a8	mov x20,x1
00ac97ac	adrp x1,0x2ce000
00ac97b0	mov x21,x0
00ac97b4	add x1,x1,#0x291
00ac97b8	mov w0,#0x28
00ac97bc	mov w2,#0x155
00ac97c0	bl 0x00c34250
00ac97c4	mov x19,x0
00ac97c8	cbz x0,0x00ac97fc
00ac97cc	bl 0x00c34d50
00ac97d0	str x0,[x19, #0x20]
00ac97d4	cbz x0,0x00ac97fc
00ac97d8	cbz x20,0x00ac9884
00ac97dc	add x8,x20,#0x18
00ac97e0	ldxr w9,[x8]
00ac97e4	add w9,w9,#0x1
00ac97e8	stxr w10,w9,[x8]
00ac97ec	cbnz w10,0x00ac97e0
00ac97f0	ldp x8,x22,[x20]
00ac97f4	ldr x23,[x8, #0x30]
00ac97f8	b 0x00ac988c
00ac97fc	adrp x20,0x2ce000
00ac9800	add x20,x20,#0x291
00ac9804	mov w2,#0x157
00ac9808	mov x0,x19
00ac980c	mov x1,x20
00ac9810	bl 0x00c32310
00ac9814	bl 0x00c342a0
00ac9818	adrp x2,0x2b2000
00ac981c	add x2,x2,#0xa7e
00ac9820	mov w1,#0x158
00ac9824	mov x0,x20
00ac9828	bl 0x00c342b0
00ac982c	mov w1,#0x100
00ac9830	orr w0,wzr,#0x6
00ac9834	movk w1,#0xc, LSL #16
00ac9838	b 0x00ac9860
00ac983c	bl 0x00c342a0
00ac9840	adrp x0,0x2ce000
00ac9844	adrp x2,0x2b2000
00ac9848	add x0,x0,#0x291
00ac984c	add x2,x2,#0xa7e
00ac9850	mov w1,#0x151
00ac9854	bl 0x00c342b0
00ac9858	orr w0,wzr,#0x6
00ac985c	mov w1,#0xda
00ac9860	mov x2,xzr
00ac9864	bl 0x00c342c0
00ac9868	mov x19,xzr
00ac986c	mov x0,x19
00ac9870	ldp x29,x30,[sp, #0x30]
00ac9874	ldp x20,x19,[sp, #0x20]
00ac9878	ldp x22,x21,[sp, #0x10]
00ac987c	ldp x24,x23,[sp], #0x40
00ac9880	ret
00ac9884	mov x22,xzr
00ac9888	mov x23,xzr
00ac988c	ldr x0,[x21]
00ac9890	ldr x24,[x21, #0x38]
00ac9894	bl 0x00c3b680
00ac9898	mov x1,x22
00ac989c	mov x2,x23
00ac98a0	blr x24
00ac98a4	str x0,[x19, #0x8]
00ac98a8	cbz x0,0x00ac98d8
00ac98ac	add x8,x21,#0x20
00ac98b0	ldxr w9,[x8]
00ac98b4	add w9,w9,#0x1
00ac98b8	stxr w10,w9,[x8]
00ac98bc	cbnz w10,0x00ac98b0
00ac98c0	add x8,x19,#0x18
00ac98c4	mov w9,#0x1
00ac98c8	str x21,[x19]
00ac98cc	str x20,[x19, #0x10]
00ac98d0	stlr w9,[x8]
00ac98d4	b 0x00ac986c
00ac98d8	bl 0x00c342a0
00ac98dc	adrp x22,0x2ce000
00ac98e0	add x22,x22,#0x291
00ac98e4	adrp x2,0x2b2000
00ac98e8	add x2,x2,#0xa7e
00ac98ec	mov w1,#0x168
00ac98f0	mov x0,x22
00ac98f4	bl 0x00c342b0
00ac98f8	mov w1,#0x100
00ac98fc	orr w0,wzr,#0x6
00ac9900	movk w1,#0xc, LSL #16
00ac9904	mov x2,xzr
00ac9908	bl 0x00c342c0
00ac990c	ldr x8,[x21, #0x40]
00ac9910	ldr x0,[x19, #0x8]
00ac9914	blr x8
00ac9918	ldr x0,[x19, #0x20]
00ac991c	bl 0x00c34d40
00ac9920	mov w2,#0x16b
00ac9924	mov x0,x19
00ac9928	mov x1,x22
00ac992c	bl 0x00c32310
00ac9930	mov x0,x20
00ac9934	bl 0x00ac993c
00ac9938	b 0x00ac9868
