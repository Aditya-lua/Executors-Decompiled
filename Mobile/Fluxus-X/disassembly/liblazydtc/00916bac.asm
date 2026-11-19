; FUN_00916bac @ 00916bac
00916bac	strb wzr,[x1]
00916bb0	ldr w9,[x0, #0x4]
00916bb4	mov x8,x1
00916bb8	mov x3,x2
00916bbc	cmp w9,#0xa
00916bc0	b.eq 0x00916be0
00916bc4	cmp w9,#0x2
00916bc8	b.ne 0x00916bf4
00916bcc	ldr x9,[x0, #0x20]
00916bd0	mov w0,#0x2
00916bd4	mov x2,x8
00916bd8	add x1,x9,#0x4
00916bdc	b 0x00c31bd0
00916be0	ldr x9,[x0, #0x20]
00916be4	mov w0,#0xa
00916be8	mov x2,x8
00916bec	add x1,x9,#0x8
00916bf0	b 0x00c31bd0
00916bf4	ret
