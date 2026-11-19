; EVP_PKEY_print_params @ 00a6e468
00a6e468	ldr x9,[x1, #0x8]
00a6e46c	mov x5,x3
00a6e470	mov x8,x0
00a6e474	cbz x9,0x00a6e480
00a6e478	ldr x4,[x9, #0x98]
00a6e47c	b 0x00a6e484
00a6e480	mov x4,xzr
00a6e484	mov w3,#0x84
00a6e488	mov x0,x1
00a6e48c	mov x1,x8
00a6e490	b 0x00a6e250
