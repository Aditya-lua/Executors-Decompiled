; FUN_00afbfac @ 00afbfac
00afbfac	stp x20,x19,[sp, #-0x20]!
00afbfb0	mov x20,x0
00afbfb4	stp x29,x30,[sp, #0x10]
00afbfb8	add x29,sp,#0x10
00afbfbc	cbz x1,0x00afbfe8
00afbfc0	mov x19,x1
00afbfc4	ldr x0,[x1]
00afbfc8	ldr x1,[x20, #0x8]
00afbfcc	ldrsw x2,[x20]
00afbfd0	bl 0x00c2ffd0
00afbfd4	ldrsw x0,[x20]
00afbfd8	ldr x8,[x19]
00afbfdc	add x8,x8,x0
00afbfe0	str x8,[x19]
00afbfe4	b 0x00afbfec
00afbfe8	ldr w0,[x20]
00afbfec	ldp x29,x30,[sp, #0x10]
00afbff0	ldp x20,x19,[sp], #0x20
00afbff4	ret
