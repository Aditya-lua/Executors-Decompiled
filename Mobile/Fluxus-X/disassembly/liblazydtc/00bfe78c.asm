; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_encoding @ 00bfe78c
00bfe78c	paciasp
00bfe790	stp x29,x30,[sp, #-0x30]!
00bfe794	str x21,[sp, #0x10]
00bfe798	stp x20,x19,[sp, #0x20]
00bfe79c	mov x29,sp
00bfe7a0	mov x19,x0
00bfe7a4	ldr x0,[x0, #0x10]
00bfe7a8	bl 0x00c43880
00bfe7ac	mov x20,x0
00bfe7b0	str x0,[x29, #0x18]
00bfe7b4	mov x0,xzr
00bfe7b8	mov x1,xzr
00bfe7bc	mov w2,#0x4
00bfe7c0	bl 0x00c43bc0
00bfe7c4	mov w21,w0
00bfe7c8	cbz x20,0x00bfe7d4
00bfe7cc	mov x0,x20
00bfe7d0	bl 0x00c43880
00bfe7d4	cbz w21,0x00bfe7e0
00bfe7d8	mov w0,#0xffffffff
00bfe7dc	b 0x00bfe818
00bfe7e0	ldr x0,[x19, #0x10]
00bfe7e4	cbz x0,0x00bfe814
00bfe7e8	bl 0x00c43880
00bfe7ec	mov x19,x0
00bfe7f0	str x0,[x29, #0x18]
00bfe7f4	bl 0x00c43a40
00bfe7f8	mov x20,x0
00bfe7fc	cbz x19,0x00bfe808
00bfe800	mov x0,x19
00bfe804	bl 0x00c43880
00bfe808	cmp x20,#0x1
00bfe80c	cset w0,eq
00bfe810	b 0x00bfe818
00bfe814	mov w0,#0x1
00bfe818	ldp x20,x19,[sp, #0x20]
00bfe81c	ldr x21,[sp, #0x10]
00bfe820	ldp x29,x30,[sp], #0x30
00bfe824	autiasp
00bfe828	ret
