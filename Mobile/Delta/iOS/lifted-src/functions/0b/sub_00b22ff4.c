/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb22ff4..0xb23148 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b22ff4_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_b22ff4_0;

extern char g_10002b0;

long long sub_b22ff4(unsigned long a0, unsigned long a1, long long a2, unsigned int a3, unsigned long a4, st_b22ff4_0 *a5)
{
    unsigned long v5;  // x0
    unsigned long v6;  // x19
    long long v7;  // x0
    unsigned long v8;  // x0
    unsigned long v0;  // [bp-0x450]
    char v1;  // [bp-0x448]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = sub_b23148();
    if (v5)
    {
        v6 = v5;
        v0 = 0;
        v7 = sub_9f2aec(a5->field_0);
        if (a5->field_10)
        {
            if (sub_a76f7c(&v1, 0x400, &v0, 0, 1, a5 + 1))
            {
                v8 = sub_aa1fe8(0xffffffff, a5->field_10, &v1, (unsigned int)v0, 0, 0, 0, v6, v7, 0);
                sub_a66ec0(&v1, v0);
                goto LABEL_b230f8;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 122, "p8info_to_encp8");
                sub_a36abc(57, 159, 0);
            }
        }
        v8 = 0;
LABEL_b230f8:
        sub_9ca820(v6);
    }
    else
    {
        switch (a3)
        {
        case 16:
            sub_9c7940(a2);
            goto LABEL_b2310c;
        case 6:
            sub_9c3580(a2);
            v8 = 0;
            break;
        default:
LABEL_b2310c:
            v8 = 0;
            break;
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v8;
    ___stack_chk_fail();
}
