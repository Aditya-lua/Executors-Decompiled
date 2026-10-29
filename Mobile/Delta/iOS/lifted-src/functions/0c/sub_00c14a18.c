/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc14a18..0xc14a6c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c14a18_0 {
    char padding_0[160];
    char field_a0;
} st_c14a18_0;


void sub_c14a18(st_c14a18_0 *a0)
{
    unsigned int v5;  // w8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_a0;
    a0->field_a0 = 2;
    if (v5 != 1)
        return;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    _pthread_mutex_destroy();
}
