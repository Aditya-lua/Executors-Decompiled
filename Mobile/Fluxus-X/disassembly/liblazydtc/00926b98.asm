; curl_mime_name @ 00926b98
00926b98	stp x20,x19,[sp, #-0x20]!
00926b9c	stp x29,x30,[sp, #0x10]
00926ba0	add x29,sp,#0x10
00926ba4	mov x20,x1
00926ba8	mov x19,x0
00926bac	cbz x0,0x00926bf0
00926bb0	adrp x8,0xcc4000
00926bb4	add x8,x8,#0x678
00926bb8	ldr x0,[x19, #0x68]
00926bbc	ldr x8,[x8]
00926bc0	blr x8
00926bc4	str xzr,[x19, #0x68]
00926bc8	cbz x20,0x00926be8
00926bcc	adrp x8,0xcc4000
00926bd0	add x8,x8,#0x688
00926bd4	mov x0,x20
00926bd8	ldr x8,[x8]
00926bdc	blr x8
00926be0	str x0,[x19, #0x68]
00926be4	cbz x0,0x00926bf8
00926be8	mov w0,wzr
00926bec	b 0x00926bfc
00926bf0	mov w0,#0x2b
00926bf4	b 0x00926bfc
00926bf8	mov w0,#0x1b
00926bfc	ldp x29,x30,[sp, #0x10]
00926c00	ldp x20,x19,[sp], #0x20
00926c04	ret
