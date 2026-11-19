; std::__ndk1::__thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::HttpClient::*)(),ix::HttpClient*>> @ 00978eac
00978eac	str x21,[sp, #-0x30]!
00978eb0	stp x20,x19,[sp, #0x10]
00978eb4	stp x29,x30,[sp, #0x20]
00978eb8	add x29,sp,#0x20
00978ebc	mov x19,x0
00978ec0	bl 0x00c30180
00978ec4	ldr x1,[x19]
00978ec8	str xzr,[x19]
00978ecc	ldr w0,[x0]
00978ed0	bl 0x00c30190
00978ed4	ldp x10,x9,[x19, #0x10]
00978ed8	ldr x8,[x19, #0x8]
00978edc	add x0,x9,x10, ASR #0x1
00978ee0	tbz w10,#0x0,0x00978eec
00978ee4	ldr x9,[x0]
00978ee8	ldr x8,[x9, x8#0x0]
00978eec	blr x8
00978ef0	ldr x20,[x19]
00978ef4	str xzr,[x19]
00978ef8	cbz x20,0x00978f0c
00978efc	mov x0,x20
00978f00	bl 0x00c301a0
00978f04	mov x0,x20
00978f08	bl 0x00c301d0
00978f0c	mov x0,x19
00978f10	bl 0x00c301d0
00978f14	ldp x29,x30,[sp, #0x20]
00978f18	ldp x20,x19,[sp, #0x10]
00978f1c	mov x0,xzr
00978f20	ldr x21,[sp], #0x30
00978f24	ret
