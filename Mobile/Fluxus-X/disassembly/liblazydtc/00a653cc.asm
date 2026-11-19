; EVP_KEM_is_a @ 00a653cc
00a653cc	cbz x0,0x00a653fc
00a653d0	stp x29,x30,[sp, #-0x10]!
00a653d4	ldr x8,[x0, #0x18]
00a653d8	mov x3,x1
00a653dc	ldr w1,[x0]
00a653e0	mov x2,xzr
00a653e4	mov x0,x8
00a653e8	mov x29,sp
00a653ec	bl 0x00c3bf70
00a653f0	cmp w0,#0x0
00a653f4	cset w0,ne
00a653f8	ldp x29,x30,[sp], #0x10
00a653fc	ret
