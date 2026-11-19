; OSSL_PARAM_set_all_unmodified @ 00a9dfe8
00a9dfe8	cbz x0,0x00a9e00c
00a9dfec	ldr x8,[x0]
00a9dff0	cbz x8,0x00a9e00c
00a9dff4	add x8,x0,#0x28
00a9dff8	mov x9,#-0x1
00a9dffc	ldr x10,[x8]
00a9e000	stur x9,[x8, #-0x8]
00a9e004	add x8,x8,#0x28
00a9e008	cbnz x10,0x00a9dffc
00a9e00c	ret
