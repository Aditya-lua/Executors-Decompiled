; X509_OBJECT_free @ 00b0a740
00b0a740	str x19,[sp, #-0x20]!
00b0a744	mov x19,x0
00b0a748	stp x29,x30,[sp, #0x10]
00b0a74c	add x29,sp,#0x10
00b0a750	cbz x0,0x00b0a77c
00b0a754	ldr w8,[x19]
00b0a758	cmp w8,#0x2
00b0a75c	b.eq 0x00b0a774
00b0a760	cmp w8,#0x1
00b0a764	b.ne 0x00b0a77c
00b0a768	ldr x0,[x19, #0x8]
00b0a76c	bl 0x00c31a90
00b0a770	b 0x00b0a77c
00b0a774	ldr x0,[x19, #0x8]
00b0a778	bl 0x00c382b0
00b0a77c	ldp x29,x30,[sp, #0x10]
00b0a780	adrp x1,0x2aa000
00b0a784	add x1,x1,#0xba3
00b0a788	mov w2,#0x1f3
00b0a78c	mov x0,x19
00b0a790	ldr x19,[sp], #0x20
00b0a794	b 0x00c32310
