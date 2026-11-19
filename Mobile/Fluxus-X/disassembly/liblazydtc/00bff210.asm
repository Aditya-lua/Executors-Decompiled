; std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::do_out @ 00bff210
00bff210	paciasp
00bff214	sub sp,sp,#0x30
00bff218	stp x29,x30,[sp, #0x10]
00bff21c	stp x20,x19,[sp, #0x20]
00bff220	add x29,sp,#0x10
00bff224	mov x8,x5
00bff228	mov x19,x7
00bff22c	mov x20,x4
00bff230	mov x1,x3
00bff234	mov x0,x2
00bff238	add x2,sp,#0x8
00bff23c	mov x5,sp
00bff240	mov x3,x8
00bff244	mov x4,x6
00bff248	mov w6,#0x10ffff
00bff24c	mov w7,wzr
00bff250	bl 0x00bfea60
00bff254	ldp x9,x8,[sp]
00bff258	str x8,[x20]
00bff25c	str x9,[x19]
00bff260	ldp x20,x19,[sp, #0x20]
00bff264	ldp x29,x30,[sp, #0x10]
00bff268	add sp,sp,#0x30
00bff26c	autiasp
00bff270	ret
