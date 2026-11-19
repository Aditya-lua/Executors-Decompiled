; FUN_00b5db38 @ 00b5db38
00b5db38	stp x24,x23,[sp, #-0x40]!
00b5db3c	stp x22,x21,[sp, #0x10]
00b5db40	stp x20,x19,[sp, #0x20]
00b5db44	stp x29,x30,[sp, #0x30]
00b5db48	ldr x24,[x0, #0x8]
00b5db4c	add x29,sp,#0x30
00b5db50	mov x19,x4
00b5db54	mov x20,x3
00b5db58	mov x23,x2
00b5db5c	mov x22,x0
00b5db60	mov x21,x1
00b5db64	bl 0x00c41000
00b5db68	cmp x23,#0x40
00b5db6c	b.ne 0x00b5dba0
00b5db70	cbz w0,0x00b5dba0
00b5db74	ldr x4,[x22]
00b5db78	ldr x5,[x24, #0x8]
00b5db7c	mov x0,x20
00b5db80	mov x1,x19
00b5db84	mov x2,x21
00b5db88	ldp x29,x30,[sp, #0x30]
00b5db8c	ldp x20,x19,[sp, #0x20]
00b5db90	ldp x22,x21,[sp, #0x10]
00b5db94	add x3,x24,#0x11
00b5db98	ldp x24,x23,[sp], #0x40
00b5db9c	b 0x00c3a690
00b5dba0	ldp x29,x30,[sp, #0x30]
00b5dba4	ldp x20,x19,[sp, #0x20]
00b5dba8	ldp x22,x21,[sp, #0x10]
00b5dbac	mov w0,wzr
00b5dbb0	ldp x24,x23,[sp], #0x40
00b5dbb4	ret
