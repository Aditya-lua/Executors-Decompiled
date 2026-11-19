; X509_OBJECT_up_ref_count @ 00b0ac9c
00b0ac9c	ldr w8,[x0]
00b0aca0	cmp w8,#0x2
00b0aca4	b.eq 0x00b0acb8
00b0aca8	cmp w8,#0x1
00b0acac	b.ne 0x00b0acc0
00b0acb0	ldr x0,[x0, #0x8]
00b0acb4	b 0x00c350b0
00b0acb8	ldr x0,[x0, #0x8]
00b0acbc	b 0x00c3f810
00b0acc0	mov w0,#0x1
00b0acc4	ret
