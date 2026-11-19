; OCSP_resp_find_status @ 00aaffa8
00aaffa8	str x27,[sp, #-0x60]!
00aaffac	stp x26,x25,[sp, #0x10]
00aaffb0	stp x24,x23,[sp, #0x20]
00aaffb4	stp x22,x21,[sp, #0x30]
00aaffb8	stp x20,x19,[sp, #0x40]
00aaffbc	stp x29,x30,[sp, #0x50]
00aaffc0	add x29,sp,#0x50
00aaffc4	cbz x0,0x00ab00bc
00aaffc8	ldr x26,[x0, #0x20]
00aaffcc	mov x24,x0
00aaffd0	mov x20,x6
00aaffd4	mov x21,x5
00aaffd8	mov x0,x26
00aaffdc	mov x23,x4
00aaffe0	mov x22,x3
00aaffe4	mov x19,x2
00aaffe8	mov x25,x1
00aaffec	bl 0x00c325e0
00aafff0	cmp w0,#0x1
00aafff4	b.lt 0x00ab002c
00aafff8	mov w27,wzr
00aafffc	mov x0,x26
00ab0000	mov w1,w27
00ab0004	bl 0x00c32610
00ab0008	ldr x1,[x0]
00ab000c	mov x0,x25
00ab0010	bl 0x00c3ef20
00ab0014	cbz w0,0x00ab0034
00ab0018	mov x0,x26
00ab001c	add w27,w27,#0x1
00ab0020	bl 0x00c325e0
00ab0024	cmp w27,w0
00ab0028	b.lt 0x00aafffc
00ab002c	mov w0,wzr
00ab0030	b 0x00ab00bc
00ab0034	ldr x0,[x24, #0x20]
00ab0038	mov w1,w27
00ab003c	bl 0x00c32610
00ab0040	cbz x0,0x00ab0084
00ab0044	ldr x8,[x0, #0x8]
00ab0048	mov x24,x0
00ab004c	ldr w25,[x8]
00ab0050	cmp w25,#0x1
00ab0054	b.ne 0x00ab0098
00ab0058	ldr x8,[x8, #0x8]
00ab005c	cbz x23,0x00ab0068
00ab0060	ldr x9,[x8]
00ab0064	str x9,[x23]
00ab0068	cbz x22,0x00ab0098
00ab006c	ldr x0,[x8, #0x8]
00ab0070	cbz x0,0x00ab0090
00ab0074	bl 0x00c37540
00ab0078	str w0,[x22]
00ab007c	cbnz x21,0x00ab009c
00ab0080	b 0x00ab00a4
00ab0084	mov w25,#0xffffffff
00ab0088	cbnz x19,0x00ab00b4
00ab008c	b 0x00ab00b8
00ab0090	mov w8,#0xffffffff
00ab0094	str w8,[x22]
00ab0098	cbz x21,0x00ab00a4
00ab009c	ldr x8,[x24, #0x10]
00ab00a0	str x8,[x21]
00ab00a4	cbz x20,0x00ab00b0
00ab00a8	ldr x8,[x24, #0x18]
00ab00ac	str x8,[x20]
00ab00b0	cbz x19,0x00ab00b8
00ab00b4	str w25,[x19]
00ab00b8	mov w0,#0x1
00ab00bc	ldp x29,x30,[sp, #0x50]
00ab00c0	ldp x20,x19,[sp, #0x40]
00ab00c4	ldp x22,x21,[sp, #0x30]
00ab00c8	ldp x24,x23,[sp, #0x20]
00ab00cc	ldp x26,x25,[sp, #0x10]
00ab00d0	ldr x27,[sp], #0x60
00ab00d4	ret
