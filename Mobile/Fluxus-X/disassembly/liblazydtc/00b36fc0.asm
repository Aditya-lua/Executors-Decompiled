; FUN_00b36fc0 @ 00b36fc0
00b36fc0	sub sp,sp,#0x20
00b36fc4	stp x29,x30,[sp, #0x10]
00b36fc8	add x29,sp,#0x10
00b36fcc	cbz x3,0x00b36ff8
00b36fd0	ldr x8,[x3]
00b36fd4	cbz x8,0x00b36ff8
00b36fd8	ldr x4,[x3, #0x8]
00b36fdc	sxtw x1,w1
00b36fe0	add x2,sp,#0x8
00b36fe4	mov x3,xzr
00b36fe8	blr x8
00b36fec	cbz w0,0x00b36ff8
00b36ff0	ldr w0,[sp, #0x8]
00b36ff4	b 0x00b36ffc
00b36ff8	mov w0,#0xffffffff
00b36ffc	ldp x29,x30,[sp, #0x10]
00b37000	add sp,sp,#0x20
00b37004	ret
