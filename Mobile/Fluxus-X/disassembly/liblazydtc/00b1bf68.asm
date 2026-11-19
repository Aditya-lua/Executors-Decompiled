; X509_NAME_get0_der @ 00b1bf68
00b1bf68	str x21,[sp, #-0x30]!
00b1bf6c	stp x20,x19,[sp, #0x10]
00b1bf70	mov x19,x2
00b1bf74	adrp x2,0xc82000
00b1bf78	mov x21,x1
00b1bf7c	add x2,x2,#0x4b0
00b1bf80	mov x1,xzr
00b1bf84	stp x29,x30,[sp, #0x20]
00b1bf88	add x29,sp,#0x20
00b1bf8c	mov x20,x0
00b1bf90	bl 0x00c36170
00b1bf94	cmp w0,#0x1
00b1bf98	b.lt 0x00b1bfc4
00b1bf9c	cbz x21,0x00b1bfac
00b1bfa0	ldr x8,[x20, #0x10]
00b1bfa4	ldr x8,[x8, #0x8]
00b1bfa8	str x8,[x21]
00b1bfac	cbz x19,0x00b1bfbc
00b1bfb0	ldr x8,[x20, #0x10]
00b1bfb4	ldr x8,[x8]
00b1bfb8	str x8,[x19]
00b1bfbc	mov w0,#0x1
00b1bfc0	b 0x00b1bfc8
00b1bfc4	mov w0,wzr
00b1bfc8	ldp x29,x30,[sp, #0x20]
00b1bfcc	ldp x20,x19,[sp, #0x10]
00b1bfd0	ldr x21,[sp], #0x30
00b1bfd4	ret
