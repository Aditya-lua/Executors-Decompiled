; mbedtls_oid_get_sig_alg @ 00ba97d0
00ba97d0	stp x20,x19,[sp, #-0x20]!
00ba97d4	stp x29,x30,[sp, #0x10]
00ba97d8	add x29,sp,#0x10
00ba97dc	mov x19,x2
00ba97e0	mov x20,x1
00ba97e4	bl 0x00ba95ac
00ba97e8	mov x8,x0
00ba97ec	cbz x0,0x00ba9808
00ba97f0	ldr w9,[x8, #0x20]
00ba97f4	mov w0,wzr
00ba97f8	str w9,[x20]
00ba97fc	ldr w8,[x8, #0x24]
00ba9800	str w8,[x19]
00ba9804	b 0x00ba980c
00ba9808	mov w0,#0xffffffd2
00ba980c	ldp x29,x30,[sp, #0x10]
00ba9810	ldp x20,x19,[sp], #0x20
00ba9814	ret
