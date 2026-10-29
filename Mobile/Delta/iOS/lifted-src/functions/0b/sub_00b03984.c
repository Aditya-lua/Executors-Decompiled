/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03984..0xb03a90 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03984_1 {
    char padding_0[676];
    char field_2a4;
} st_b03984_1;

typedef struct st_b03984_0 {
    char padding_0[868];
    char field_364;
} st_b03984_0;

extern unsigned int g_f0d568;

unsigned long long sub_b03984(st_b03984_0 *a0, long long a1, unsigned int a2)
{
    st_b03984_1 *v2;  // x2
    long long v3;  // x1
    long long v4;  // x21
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(g_f0d568 >> 2 & 1))
    {
        sub_a97708(&a0->padding_0[688]);
        v2 = &a0->padding_0[192];
        v3 = a2 * 8;
        if (!(g_f0d568 & 1))
        {
            sub_9b8880(a1, v3, v2);
            sub_9b8ba4(a1, v3, &a0->padding_0[440]);
        }
        else
        {
            sub_9bf0e0(a1, v3, v2);
            sub_9bf120(a1, v3, &a0->padding_0[440]);
        }
    }
    else
    {
        sub_a97708(&a0->padding_0[688]);
        v4 = a2 * 8;
        sub_9b9440(a1, v4, &a0->padding_0[192]);
        sub_9b9660(a1, v4, &a0->padding_0[440]);
    }
    v5 = sub_a96854(&a0->padding_0[688], &a0->padding_0[192], &a0->padding_0[440]);
    if (!(unsigned int)v5)
        return v5;
    a0->field_364 = a0->field_364 | 1;
    return 1;
}
