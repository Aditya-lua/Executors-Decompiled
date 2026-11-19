; PKCS12_SAFEBAG_get0_pkcs8 @ 00abc764
00abc764	str x19,[sp, #-0x20]!
00abc768	stp x29,x30,[sp, #0x10]
00abc76c	mov x19,x0
00abc770	ldr x0,[x0]
00abc774	add x29,sp,#0x10
00abc778	bl 0x00c37750
00abc77c	cmp w0,#0x97
00abc780	mov x0,xzr
00abc784	b.ne 0x00abc78c
00abc788	ldr x0,[x19, #0x8]
00abc78c	ldp x29,x30,[sp, #0x10]
00abc790	ldr x19,[sp], #0x20
00abc794	ret
