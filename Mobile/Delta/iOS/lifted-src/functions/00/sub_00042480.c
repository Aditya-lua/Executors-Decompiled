/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42480..0x4259c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_42480_0 {
    char field_0;
} st_42480_0;

extern unsigned long long g_e669a0;
extern unsigned long long g_e669e8;
extern unsigned int g_f00b50;
extern char g_f0ca50;

void sub_42480(long long a0, void* a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    void* v10;  // x0
    void* v11;  // x0
    unsigned long long *v12;  // x8
    void* v13;  // x0
    st_42480_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_42480_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = sub_47588(a1);
    if (v10)
    {
        v11 = sub_34930(a0 + 144, v10 + 32);
        if (v11 && (char)v11[9] == 1)
            goto *((void *)(g_e669a0));
        goto *((void *)(g_e669a0));
    }
    else if (g_f0ca50 == 1)
    {
        v12 = &g_e669e8;
        if (!a1)
            goto *((void *)(g_e669e8));
        if ((int)a1[8] == g_f00b50)
        {
            v13 = sub_10160(a0 + 624, a1 + 32);
            if (!v13)
                goto LABEL_4255c;
            sub_46ddc(a0, (long long)v13[8]);
            v12 = &g_e669a0;
        }
        goto *((void *)(*v12));
    }
    else
    {
LABEL_4255c:
        goto *((void *)(g_e669e8));
    }
}
