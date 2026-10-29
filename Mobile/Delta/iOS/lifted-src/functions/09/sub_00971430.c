/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971430..0x971534 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971430_0 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    char padding_50[32];
    void* field_70;
    void* field_78;
    void* field_80;
    void* field_88;
    void* field_90;
    void* field_98;
} st_971430_0;


void* sub_971430(st_971430_0 *a0, long long a1)
{
    void* v3;  // w0
    unsigned long long v4;  // x8
    unsigned long long v5;  // x10
    unsigned long long v6;  // x11
    unsigned long long v7;  // x9
    unsigned long long v8;  // x12
    unsigned int v9;  // w9
    unsigned long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_a6fbc4(a1, "max_dgram_payload_len"))
        return 1;
    v3 = (void*)(unsigned int)sub_a70ef8();
    if (!v3)
        return v3;
    v4 = v0;
    if (1200 > v4)
        return 0;
    v5 = a0->field_30;
    a0->field_30 = v4;
    v6 = v4 * 2;
    v7 = 14720;
    if (14720 < v6)
        v7 = v6;
    v8 = v4 * 10;
    if (v8 < v7)
        v7 = v8;
    a0->field_10 = v7;
    a0->field_18 = v6;
    if (v5 > v4)
        a0->field_40 = v7;
    if (a0->field_78)
        *(unsigned long long *)a0->field_78 = v4;
    if (a0->field_80)
        *(unsigned long long *)a0->field_80 = a0->field_40;
    if (a0->field_88)
        *(unsigned long long *)a0->field_88 = a0->field_18;
    if (a0->field_90)
        *(unsigned long long *)a0->field_90 = a0->field_38;
    if (a0->field_98)
    {
        if ((int)a0->field_70)
        {
            v9 = 82;
        }
        else if (a0->field_40 < a0->field_48)
        {
            v9 = 83;
        }
        else
        {
            v9 = 65;
        }
LABEL_97151c:
        *(unsigned int *)a0->field_98 = v9;
        goto LABEL_97151c;
    }
    return 1;
}
