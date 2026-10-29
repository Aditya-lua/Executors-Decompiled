/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c96fc..0x9c97fc (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c96fc_0 {
    unsigned int field_0;
    char padding_4[4];
    void* field_8;
} st_9c96fc_0;

extern long long g_e8a238;

unsigned long long sub_9c96fc(st_9c96fc_0 *a0, void* a1, void* a2, int a3)
{
    int v2;  // w23
    void* v3;  // x19
    unsigned long long v4;  // x21
    unsigned long long v6;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 16 && a0->field_8)
    {
        v2 = a3;
        v3 = sub_9c5520(&g_e8a238, a0);
        if (v3)
        {
            v4 = sub_9c7b68((long long)v3[8]);
            if (a1)
                *(long long *)a1 = *(int *)v3;
            if (a2)
            {
                if ((int)v4 < v2)
                    v2 = v4;
                _memcpy(a2, sub_c4c40(), v2);
            }
            v6 = arm64g_calculate_condition(0x11, v4 & 0xffffffff, 1, 0);
            if (v6 & 1)
            {
                sub_9cd960(v3, &g_e8a238);
                return v4;
            }
        }
    }
    else
    {
        v3 = 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/evp_asn1.c", 141, "ASN1_TYPE_get_int_octetstring");
    sub_a36abc(13, 109, 0);
    sub_9cd960(v3, &g_e8a238);
    return 0xffffffff;
}
