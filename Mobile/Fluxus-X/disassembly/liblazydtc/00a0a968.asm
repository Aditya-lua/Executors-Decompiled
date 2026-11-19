; BN_print @ 00a0a968
00a0a968	str x25,[sp, #-0x50]!
00a0a96c	stp x24,x23,[sp, #0x10]
00a0a970	stp x22,x21,[sp, #0x20]
00a0a974	stp x20,x19,[sp, #0x30]
00a0a978	stp x29,x30,[sp, #0x40]
00a0a97c	ldr w8,[x1, #0x10]
00a0a980	mov x19,x1
00a0a984	mov x20,x0
00a0a988	add x29,sp,#0x40
00a0a98c	cbz w8,0x00a0a9b0
00a0a990	adrp x1,0x2cc000
00a0a994	add x1,x1,#0xc8b
00a0a998	mov w2,#0x1
00a0a99c	mov x0,x20
00a0a9a0	bl 0x00c34240
00a0a9a4	cmp w0,#0x1
00a0a9a8	mov w0,wzr
00a0a9ac	b.ne 0x00a0aa5c
00a0a9b0	mov x0,x19
00a0a9b4	bl 0x00c369b0
00a0a9b8	cbz w0,0x00a0a9dc
00a0a9bc	adrp x1,0x2cb000
00a0a9c0	add x1,x1,#0x723
00a0a9c4	mov w2,#0x1
00a0a9c8	mov x0,x20
00a0a9cc	bl 0x00c34240
00a0a9d0	cmp w0,#0x1
00a0a9d4	mov w0,wzr
00a0a9d8	b.ne 0x00a0aa5c
00a0a9dc	ldrsw x21,[x19, #0x8]
00a0a9e0	cmp w21,#0x1
00a0a9e4	b.lt 0x00a0aa58
00a0a9e8	adrp x22,0x751000
00a0a9ec	mov w23,wzr
00a0a9f0	add x22,x22,#0xf38
00a0a9f4	mov x24,x21
00a0a9f8	sub x21,x21,#0x1
00a0a9fc	orr w25,wzr,#0x3c
00a0aa00	ldr x8,[x19]
00a0aa04	ldr x8,[x8, x21, LSL #0x3]
00a0aa08	lsr x8,x8,x25
00a0aa0c	and w8,w8,#0xf
00a0aa10	orr w9,w8,w23
00a0aa14	cbz w9,0x00a0aa34
00a0aa18	add x1,x22,x8
00a0aa1c	mov w2,#0x1
00a0aa20	mov x0,x20
00a0aa24	mov w23,#0x1
00a0aa28	bl 0x00c34240
00a0aa2c	cmp w0,#0x1
00a0aa30	b.ne 0x00a0aa50
00a0aa34	sub x25,x25,#0x4
00a0aa38	cmn x25,#0x4
00a0aa3c	b.ne 0x00a0aa00
00a0aa40	cmp x24,#0x2
00a0aa44	mov w0,#0x1
00a0aa48	b.ge 0x00a0a9f4
00a0aa4c	b 0x00a0aa5c
00a0aa50	mov w0,wzr
00a0aa54	b 0x00a0aa5c
00a0aa58	mov w0,#0x1
00a0aa5c	ldp x29,x30,[sp, #0x40]
00a0aa60	ldp x20,x19,[sp, #0x30]
00a0aa64	ldp x22,x21,[sp, #0x20]
00a0aa68	ldp x24,x23,[sp, #0x10]
00a0aa6c	ldr x25,[sp], #0x50
00a0aa70	ret
