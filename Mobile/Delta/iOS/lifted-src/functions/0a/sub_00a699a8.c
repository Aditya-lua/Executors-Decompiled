/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa699a8..0xa69abc (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f0d574;

long long sub_a699a8(int a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 > 4)
    {
        if (7 >= a0)
        {
            if (a0 == 5)
            {
                return "ENGINESDIR: \"/usr/local/lib/engines-3\"";
            }
            else if (a0 == 6)
            {
                return "3.5.8";
            }
            else if (a0 == 7)
            {
                return "3.5.8";
            }
            else
            {
                return "not available";
            }
        }
        else
        {
            if (a0 == 8)
            {
                return "MODULESDIR: \"/usr/local/lib/ossl-modules\"";
            }
            else if (a0 == 9)
            {
                v0 = &v2;
                v1 = v3;
                if (sub_a6acdc(1008))
                    return &g_f0d574;
                return "CPUINFO: N/A";
            }
            else if (a0 == 10)
            {
                return "OSSL_WINCTX: Undefined";
            }
            else
            {
                return "not available";
            }
        }
    }
    else
    {
        if (a0 > 1)
        {
            if (a0 == 2)
            {
                return "built on: Sat Aug 29 01:24:21 2026 UTC";
            }
            else if (a0 == 3)
            {
                return "platform: ios64-xcrun";
            }
            else if (a0 == 4)
            {
                return "OPENSSLDIR: \"/etc/ssl\"";
            }
            else
            {
                return "not available";
            }
        }
        else
        {
            if (!a0)
            {
                return "OpenSSL 3.5.8 25 Aug 2026";
            }
            else if (a0 == 1)
            {
                return "compiler: xcrun -sdk iphoneos cc -fPIC -arch arm64 -fno-common -O3 -miphoneos-version-min=13.0 -fPIC -O2 -ffunction-sections -fdata-sections -DOPENSSL_PIC -D_REENTRANT -DOPENSSL_BUILDING_OPENSSL -DNDEBUG";
            }
            else
            {
                return "not available";
            }
        }
    }
}
