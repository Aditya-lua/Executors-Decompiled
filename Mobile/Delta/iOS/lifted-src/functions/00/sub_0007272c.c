/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7272c..0x72ecc (1952 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7272c_0 {
    char field_0;
} st_7272c_0;

extern unsigned long long g_e69a98;
extern unsigned long long g_e69ac0;
extern unsigned long long g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

long long sub_7272c(unsigned long a0, long long a1, long long a2, long long a3)
{
    long long v53;  // w24
    long long v54;  // w24
    unsigned long v63;  // x1
    long long v65;  // x8
    long long v66;  // x0
    long long v67;  // x21
    long long v68;  // x0
    long long v69;  // x0
    long long v56;  // x0
    char *v57;  // x26
    long long v58;  // w26
    long long v59;  // x0
    long long v60;  // x22
    long long v61;  // x0
    long long v62;  // x0
    unsigned long long v0;  // [bp-0x340]
    unsigned long long v1;  // [bp-0x338]
    char *v2;  // [bp-0x328]
    st_7272c_0 **v3;  // [bp-0x318], Other Possible Types: char
    st_7272c_0 *v4;  // [bp-0x310]
    char v5;  // [bp-0x308]
    unsigned long long v6;  // [bp-0x2f0]
    unsigned long long v7;  // [bp-0x2e8]
    unsigned long long v8;  // [bp-0x2e0]
    unsigned long long *v9;  // [bp-0x2c8]
    unsigned long long v10;  // [bp-0x2c0]
    unsigned long long v11;  // [bp-0x2b8]
    unsigned long long v12;  // [bp-0x2b0]
    unsigned long long v13;  // [bp-0x2a8]
    unsigned long long v14;  // [bp-0x2a0]
    unsigned long long *v15;  // [bp-0x298]
    unsigned long long v16;  // [bp-0x290]
    unsigned long long v17;  // [bp-0x288]
    unsigned long long v18;  // [bp-0x280]
    unsigned long v19;  // [bp-0x280]
    unsigned long long v20;  // [bp-0x278]
    unsigned long long v21;  // [bp-0x270]
    unsigned long long v22;  // [bp-0x268]
    char v23;  // [bp-0x260]
    long long v24;  // [bp-0x258]
    char v25;  // [bp-0x248]
    char v26;  // [bp-0x230]
    unsigned long long v27;  // [bp-0x200]
    unsigned long long *v28;  // [bp-0x168]
    unsigned long long v29;  // [bp-0x160]
    unsigned long long v30;  // [bp-0x158]
    char v31;  // [bp-0x150], Other Possible Types: unsigned long long
    char v32;  // [bp-0x148]
    char v33;  // [bp-0x130]
    char v34;  // [bp-0x128]
    char v35;  // [bp-0x118]
    char v36;  // [bp-0x100]
    char v37;  // [bp-0xe8]
    char v38;  // [bp-0xcc]
    unsigned long long v39;  // [bp-0xc8]
    unsigned long long v40;  // [bp-0xc0]
    unsigned long long v41;  // [bp-0xb8]
    unsigned long long v42;  // [bp-0xb0]
    unsigned long long v43;  // [bp-0xa8]
    unsigned long long v44;  // [bp-0xa0]
    unsigned long long v45;  // [bp-0x98]
    unsigned long long v46;  // [bp-0x90]
    unsigned long long v47;  // [bp-0x88]
    unsigned long long v48;  // [bp-0x80]
    unsigned long long v49;  // [bp-0x78]
    unsigned long long v50;  // [bp-0x70]
    char *v51;  // [bp-0x10]
    char v52;  // [bp+0x0]

    v51 = &v52;
    v4 = &v3;
    v3 = &v4;
    std::__1::mutex::lock(a0 + 216);
    v48 = 0;
    v49 = 0;
    v50 = 0;
    v45 = 0;
    v46 = 0;
    v47 = 0;
    v42 = 0;
    v43 = 0;
    v44 = 0;
    v39 = 0;
    v40 = 0;
    v41 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v37, a1);
    v18 = 0;
    v20 = 0;
    v21 = 0;
    v29 = 0;
    v30 = 0;
    v28 = &v29;
    v6 = 0;
    v7 = 0;
    v8 = 0;
    sub_70dc8(&v31, 0, 0, &v18, &v28, &v6);
    sub_62aa0(&v28, v29);
    v2 = &v34;
    v53 = 10;
    v1 = &g_e69c70;
    v0 = &g_10001c8;
    while (1)
    {
        v54 = v53;
        if (!(sub_6a8dc(&v37, &v48, &v45, &v42, &v39, &v38) & 1))
        {
            sub_62748(&v18);
            v66 = sub_60404(&v21, "Could not parse url: '", 22);
            v67 = a1;
            v68 = sub_a0c8(v67);
            v69 = sub_60404(v66, v68, sub_6b08(v67));
            sub_60404(v69, "'", 1);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v6, sub_62368(&v22), "'", "'");
            v16 = 0;
            v17 = 0;
            v14 = 0;
            v15 = &v16;
            v12 = 0;
            v13 = 0;
            sub_70dc8(v65, 0, 0, &v6, &v15, &v12);
            sub_62aa0(&v15, v16);
            v18 = &g_e69a98;
            v21 = &g_e69ac0;
            v27 = &g_e69ae8;
            v22 = &g_e69c70;
            v22 = &g_10001c8;
            break;
        }
        v12 = 0;
        v13 = 0;
        v14 = 0;
        sub_67110(sub_9fd8(&v48, "wss"), 0xffffffff, &v12, a0 + 560);
        v19 = 0;
        sub_63c08(a0 + 208, v18);
        sub_63c08(&v19, 0);
        v56 = operatornew(16);
        sub_71434(v56);
        v18 = 0;
        sub_7236c(a0 + 496, v56);
        sub_7236c(&v18, 0);
        if (!*(long long *)(a0 + 208))
        {
            v10 = 0;
            v11 = 0;
            v9 = &v10;
            v18 = 0;
            v20 = 0;
            v21 = 0;
            sub_70dc8(v65, 0, 0, &v12, &v9, &v18);
            sub_62aa0(&v9, v10);
            break;
        }
        sub_6e8cc(&v6, a0 + 696, a0 + 208, a0 + 496, a0 + 504, a0 + 509);
        sub_6ed9c(&v6, &v37, a2, &v48, &v45, &v42, v38, a3);
        v31 = v18;
        sub_5ccc(&v32, &v20);
        sub_74234(&v33, &v23);
        sub_5ccc(&v35, &v25);
        sub_5ccc(&v36, &v26);
        sub_62aa0(&v23, v24);
        if (99 >= *(unsigned int *)((void*)&v31 + 4) - 300)
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v18, "Location", 8);
            v57 = sub_624a8(&v33, &v18);
            if (v2 != v57)
            {
                v37 = (char)(v57 + 56);
                v58 = 4;
                if (!1)
                    goto LABEL_72b64;
            }
            else
            {
                sub_62748(&v18);
                v59 = sub_60404(sub_60404(&v21, "Missing Location Header for HTTP Redirect response. ", 52), "Rejecting connection to ", 24);
                v60 = a1;
                v61 = sub_a0c8(v60);
                v62 = sub_60404(sub_60404(v59, v61, sub_6b08(v60)), ", status: ", 10);
                v63 = *(unsigned int *)((void*)&v31 + 4);
                std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(v62, v63, 10);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, sub_62368(&v22), v63, v63);
                sub_5ccc(&v32, &v5);
                v18 = &g_e69a98;
                v27 = &g_e69ae8;
                v21 = &g_e69ac0;
                v22 = v1;
                v22 = v0;
                v58 = 2;
LABEL_72b64:
                if (v58 != 2)
                    break;
LABEL_72b6c:
                *(unsigned long long *)v65 = v31;
                sub_5c38(v65 + 8, &v32);
                sub_6c5f8(v65 + 32, &v33);
                sub_5c38(v65 + 56, &v35);
                sub_5c38(v65 + 80, &v36);
                break;
            }
        }
        else
        {
            if ((char)v31 == 1)
                sub_72ecc(a0, 3);
            *(unsigned long long *)v65 = v31;
            sub_5c38(v65 + 8, &v32);
            sub_6c5f8(v65 + 32, &v33);
            sub_5c38(v65 + 56, &v35);
            sub_5c38(v65 + 80, &v36);
            v58 = 1;
            if (1)
                goto LABEL_72b64;
        }
        v53 = v54 - 1;
        if (v54 == 1)
            goto LABEL_72b6c;
    }
    sub_62aa0(&v33, v34);
    return std::__1::mutex::unlock(a0 + 216);
}
