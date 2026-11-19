; X509V3_EXT_add_nconf_sk @ 00af47a0
00af47a0	stp x26,x25,[sp, #-0x50]!
00af47a4	stp x20,x19,[sp, #0x30]
00af47a8	mov x20,x1
00af47ac	mov x1,x2
00af47b0	stp x24,x23,[sp, #0x10]
00af47b4	stp x22,x21,[sp, #0x20]
00af47b8	stp x29,x30,[sp, #0x40]
00af47bc	add x29,sp,#0x40
00af47c0	mov x19,x3
00af47c4	mov x21,x0
00af47c8	bl 0x00c394b0
00af47cc	cbz x0,0x00af48ac
00af47d0	mov x22,x0
00af47d4	bl 0x00c325e0
00af47d8	cmp w0,#0x1
00af47dc	b.lt 0x00af4898
00af47e0	mov w23,wzr
00af47e4	mov x0,x22
00af47e8	mov w1,w23
00af47ec	bl 0x00c32610
00af47f0	ldp x2,x3,[x0]
00af47f4	ldr x4,[x0, #0x10]
00af47f8	mov x0,x21
00af47fc	mov x1,x20
00af4800	bl 0x00af3e8c
00af4804	cbz x0,0x00af48ac
00af4808	mov x24,x0
00af480c	cbz x19,0x00af487c
00af4810	ldr w8,[x20]
00af4814	cmp w8,#0x2
00af4818	b.ne 0x00af4868
00af481c	ldr x25,[x19]
00af4820	mov x0,x24
00af4824	bl 0x00c32b70
00af4828	mov x26,x0
00af482c	mov w2,#0xffffffff
00af4830	mov x0,x25
00af4834	mov x1,x26
00af4838	bl 0x00c3f000
00af483c	tbnz w0,#0x1f,0x00af4868
00af4840	mov w1,w0
00af4844	mov x0,x25
00af4848	bl 0x00c3efd0
00af484c	bl 0x00c35b00
00af4850	mov w2,#0xffffffff
00af4854	mov x0,x25
00af4858	mov x1,x26
00af485c	bl 0x00c3f000
00af4860	mov w1,w0
00af4864	tbz w0,#0x1f,0x00af4844
00af4868	mov w2,#0xffffffff
00af486c	mov x0,x19
00af4870	mov x1,x24
00af4874	bl 0x00c3efc0
00af4878	cbz x0,0x00af48a0
00af487c	mov x0,x24
00af4880	bl 0x00c35b00
00af4884	mov x0,x22
00af4888	add w23,w23,#0x1
00af488c	bl 0x00c325e0
00af4890	cmp w23,w0
00af4894	b.lt 0x00af47e4
00af4898	mov w0,#0x1
00af489c	b 0x00af48ac
00af48a0	mov x0,x24
00af48a4	bl 0x00c35b00
00af48a8	mov w0,wzr
00af48ac	ldp x29,x30,[sp, #0x40]
00af48b0	ldp x20,x19,[sp, #0x30]
00af48b4	ldp x22,x21,[sp, #0x20]
00af48b8	ldp x24,x23,[sp, #0x10]
00af48bc	ldp x26,x25,[sp], #0x50
00af48c0	ret
