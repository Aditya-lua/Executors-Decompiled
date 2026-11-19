; OCSP_resp_get0_id @ 00aafde4
00aafde4	ldr w9,[x0, #0x8]
00aafde8	cmp w9,#0x1
00aafdec	b.eq 0x00aafe08
00aafdf0	mov w8,wzr
00aafdf4	cbnz w9,0x00aafe18
00aafdf8	ldr x8,[x0, #0x10]
00aafdfc	str x8,[x2]
00aafe00	str xzr,[x1]
00aafe04	b 0x00aafe14
00aafe08	ldr x8,[x0, #0x10]
00aafe0c	str x8,[x1]
00aafe10	str xzr,[x2]
00aafe14	mov w8,#0x1
00aafe18	mov w0,w8
00aafe1c	ret
