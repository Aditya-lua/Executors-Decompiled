; FUN_00ac44bc @ 00ac44bc
00ac44bc	stp x20,x19,[sp, #-0x20]!
00ac44c0	stp x29,x30,[sp, #0x10]
00ac44c4	mov x19,x1
00ac44c8	mov x20,x0
00ac44cc	ldr x0,[x0, #0x8]
00ac44d0	ldr x1,[x1, #0x8]
00ac44d4	add x29,sp,#0x10
00ac44d8	bl 0x00c301f0
00ac44dc	cbnz w0,0x00ac4504
00ac44e0	ldr x8,[x20]
00ac44e4	cbz x8,0x00ac4500
00ac44e8	ldr x9,[x19]
00ac44ec	cbz x9,0x00ac4500
00ac44f0	cmp x9,x8
00ac44f4	csetm w8,cc
00ac44f8	csinc w0,w8,wzr,ls
00ac44fc	b 0x00ac4504
00ac4500	mov w0,wzr
00ac4504	ldp x29,x30,[sp, #0x10]
00ac4508	ldp x20,x19,[sp], #0x20
00ac450c	ret
