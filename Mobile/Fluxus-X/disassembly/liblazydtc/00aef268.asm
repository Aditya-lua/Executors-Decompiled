; ERR_print_errors_cb @ 00aef268
00aef268	stp x28,x27,[sp, #-0x60]!
00aef26c	stp x26,x25,[sp, #0x10]
00aef270	stp x24,x23,[sp, #0x20]
00aef274	stp x22,x21,[sp, #0x30]
00aef278	stp x20,x19,[sp, #0x40]
00aef27c	stp x29,x30,[sp, #0x50]
00aef280	add x29,sp,#0x50
00aef284	sub sp,sp,#0x1, LSL #12
00aef288	sub sp,sp,#0x30
00aef28c	mov x19,x1
00aef290	mov x20,x0
00aef294	bl 0x00c3ecb0
00aef298	adrp x22,0x2be000
00aef29c	adrp x23,0x2a2000
00aef2a0	mov w27,#0x1000
00aef2a4	mov x28,sp
00aef2a8	add x22,x22,#0x3e3
00aef2ac	add x23,x23,#0xd34
00aef2b0	stur x0,[x29, #-0x60]
00aef2b4	sub x0,x29,#0x68
00aef2b8	sub x1,x29,#0x7c
00aef2bc	sub x2,x29,#0x78
00aef2c0	sub x3,x29,#0x70
00aef2c4	sub x4,x29,#0x80
00aef2c8	bl 0x00c3bdf0
00aef2cc	cbz x0,0x00aef3ac
00aef2d0	mov x24,x0
00aef2d4	mov x0,sp
00aef2d8	mov w2,#0x1000
00aef2dc	mov w1,wzr
00aef2e0	bl 0x00c301c0
00aef2e4	ldurb w8,[x29, #-0x80]
00aef2e8	tbnz w8,#0x1,0x00aef2f8
00aef2ec	adrp x8,0x2ab000
00aef2f0	add x8,x8,#0x32c
00aef2f4	stur x8,[x29, #-0x70]
00aef2f8	sub x0,x29,#0x60
00aef2fc	mov w1,#0x8
00aef300	mov w2,wzr
00aef304	bl 0x00c3e860
00aef308	adrp x8,0x2cb000
00aef30c	cmp x0,#0x0
00aef310	add x8,x8,#0x889
00aef314	adrp x2,0x2c8000
00aef318	mov x25,x0
00aef31c	csel x3,x8,x0,eq
00aef320	mov x0,sp
00aef324	mov w1,#0x1000
00aef328	add x2,x2,#0x313
00aef32c	bl 0x00c34d30
00aef330	mov x0,sp
00aef334	bl 0x00c2ff50
00aef338	ldur x1,[x29, #-0x78]
00aef33c	sxtw x21,w0
00aef340	add x26,x28,x21
00aef344	sub x3,x27,x21
00aef348	mov x0,x24
00aef34c	mov x2,x26
00aef350	bl 0x00c3bea0
00aef354	mov x0,x26
00aef358	bl 0x00c2ff50
00aef35c	ldp x5,x3,[x29, #-0x70]
00aef360	ldur w4,[x29, #-0x7c]
00aef364	add w8,w0,w21
00aef368	sxtw x8,w8
00aef36c	add x0,x28,x8
00aef370	sub x1,x27,x8
00aef374	mov x2,x22
00aef378	bl 0x00c34d30
00aef37c	mov w2,#0x2b
00aef380	mov x0,x25
00aef384	mov x1,x23
00aef388	bl 0x00c32310
00aef38c	mov x0,sp
00aef390	bl 0x00c2ff50
00aef394	mov x1,x0
00aef398	mov x0,sp
00aef39c	mov x2,x19
00aef3a0	blr x20
00aef3a4	cmp w0,#0x0
00aef3a8	b.gt 0x00aef2b4
00aef3ac	add sp,sp,#0x1, LSL #12
00aef3b0	add sp,sp,#0x30
00aef3b4	ldp x29,x30,[sp, #0x50]
00aef3b8	ldp x20,x19,[sp, #0x40]
00aef3bc	ldp x22,x21,[sp, #0x30]
00aef3c0	ldp x24,x23,[sp, #0x20]
00aef3c4	ldp x26,x25,[sp, #0x10]
00aef3c8	ldp x28,x27,[sp], #0x60
00aef3cc	ret
